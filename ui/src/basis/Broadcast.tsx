import { BaseComponent } from './BaseComponent'
import { Main, MainContent } from '../level1/Main'
import { Console } from '../level1/Console'

export class Broadcast {
  private static darkTheme: boolean = false
  private static consoleOpen: boolean = true
  private static mainContent: MainContent = MainContent.FLOW_SELECTION

  public static setDark(isDark: boolean) {
    this.darkTheme = isDark
    BaseComponent.getComponents().forEach(x => x.onThemeChanged(isDark))
  }

  public static isDark(): boolean {
    return this.darkTheme
  }

  public static setConsoleOpen(isOpen: boolean) {
    this.consoleOpen = isOpen
    BaseComponent.getComponents().forEach(x => x.onConsoleChanged(isOpen))
  }

  public static isConsoleOpen(): boolean {
    return this.consoleOpen
  }

  public static setMainContent(mainContent: MainContent) {
    this.mainContent = mainContent
    BaseComponent.getComponents().forEach(x => x.onMainContentChanged(mainContent))
  }

  public static getMainContent(): MainContent {
    return this.mainContent
  }

  public static onSocketConnected(e: Event) {
    BaseComponent.getComponents().forEach(x => x.onSocketConnected(e))
  }

  public static onSocketClosed(e: CloseEvent) {
    BaseComponent.getComponents().forEach(x => x.onSocketClosed(e))
  }

  public static onSocketError(e: Event) {
    BaseComponent.getComponents().forEach(x => x.onSocketError(e))
  }

  public static onSocketMessage(type: string, data: any) {
    BaseComponent.getComponents().forEach(x => x.onSocketMessage(type, data))
  }

  public static sendSocketMessage(cmd: string, args: object) {
    Console.log(`sending message of type '${cmd}'.`, 'WebSocket')
    const json = JSON.stringify({
      cmd: cmd,
      args: args,
    })

    const ws = Main.instance.getWebSocket()

    if (ws == null) {
      Console.error('Main.instance.ws is null', 'WebSocket')
      return
    }

    ws.send(json)
  }
}