package tr.havelsan.ueransim.ngap2;

public enum NgapProcedure {
    AMFConfigurationUpdateAcknowledge,
    AMFConfigurationUpdateFailure,
    AMFConfigurationUpdate,
    AMFStatusIndication,
    CellTrafficTrace,
    DeactivateTrace,
    DownlinkNASTransport,
    DownlinkNonUEAssociatedNRPPaTransport,
    DownlinkRANConfigurationTransfer,
    DownlinkRANStatusTransfer,
    DownlinkUEAssociatedNRPPaTransport,
    ErrorIndication,
    HandoverCancelAcknowledge,
    HandoverCancel,
    HandoverCommand,
    HandoverFailure,
    HandoverNotify,
    HandoverPreparationFailure,
    HandoverRequestAcknowledge,
    HandoverRequest,
    HandoverRequired,
    InitialContextSetupFailure,
    InitialContextSetupRequest,
    InitialContextSetupResponse,
    InitialUEMessage,
    LocationReportingControl,
    LocationReportingFailureIndication,
    LocationReport,
    NASNonDeliveryIndication,
    NGAP_Message,
    NGResetAcknowledge,
    NGReset,
    NGSetupFailure,
    NGSetupRequest,
    NGSetupResponse,
    OverloadStart,
    OverloadStop,
    Paging,
    PathSwitchRequestAcknowledge,
    PathSwitchRequestFailure,
    PathSwitchRequest,
    PDUSessionResourceModifyConfirm,
    PDUSessionResourceModifyIndication,
    PDUSessionResourceModifyRequest,
    PDUSessionResourceModifyResponse,
    PDUSessionResourceNotify,
    PDUSessionResourceReleaseCommand,
    PDUSessionResourceReleaseResponse,
    PDUSessionResourceSetupRequest,
    PDUSessionResourceSetupResponse,
    PrivateMessage,
    PWSCancelRequest,
    PWSCancelResponse,
    PWSFailureIndication,
    PWSRestartIndication,
    RANConfigurationUpdateAcknowledge,
    RANConfigurationUpdateFailure,
    RANConfigurationUpdate,
    RerouteNASRequest,
    RRCInactiveTransitionReport,
    TraceFailureIndication,
    TraceStart,
    UEContextModificationFailure,
    UEContextModificationRequest,
    UEContextModificationResponse,
    UEContextReleaseCommand,
    UEContextReleaseComplete,
    UEContextReleaseRequest,
    UERadioCapabilityCheckRequest,
    UERadioCapabilityCheckResponse,
    UERadioCapabilityInfoIndication,
    UETNLABindingReleaseRequest,
    UplinkNASTransport,
    UplinkNonUEAssociatedNRPPaTransport,
    UplinkRANConfigurationTransfer,
    UplinkRANStatusTransfer,
    UplinkUEAssociatedNRPPaTransport,
    WriteReplaceWarningRequest,
    WriteReplaceWarningResponse;

    public NgapPduDescription pduDescription() {
        switch (this) {
            case AMFConfigurationUpdate:
            case AMFStatusIndication:
            case CellTrafficTrace:
            case DeactivateTrace:
            case DownlinkNASTransport:
            case DownlinkNonUEAssociatedNRPPaTransport:
            case DownlinkRANConfigurationTransfer:
            case DownlinkRANStatusTransfer:
            case DownlinkUEAssociatedNRPPaTransport:
            case ErrorIndication:
            case HandoverCancel:
            case HandoverNotify:
            case HandoverRequired:
            case HandoverRequest:
            case InitialContextSetupRequest:
            case InitialUEMessage:
            case LocationReport:
            case LocationReportingControl:
            case LocationReportingFailureIndication:
            case NASNonDeliveryIndication:
            case NGReset:
            case NGSetupRequest:
            case OverloadStart:
            case OverloadStop:
            case Paging:
            case PathSwitchRequest:
            case PDUSessionResourceModifyRequest:
            case PDUSessionResourceModifyIndication:
            case PDUSessionResourceNotify:
            case PDUSessionResourceReleaseCommand:
            case PDUSessionResourceSetupRequest:
            case PrivateMessage:
            case PWSCancelRequest:
            case PWSFailureIndication:
            case PWSRestartIndication:
            case RANConfigurationUpdate:
            case RerouteNASRequest:
            case RRCInactiveTransitionReport:
            case TraceFailureIndication:
            case TraceStart:
            case UEContextModificationRequest:
            case UEContextReleaseCommand:
            case UEContextReleaseRequest:
            case UERadioCapabilityCheckRequest:
            case UERadioCapabilityInfoIndication:
            case UETNLABindingReleaseRequest:
            case UplinkNASTransport:
            case UplinkNonUEAssociatedNRPPaTransport:
            case UplinkRANConfigurationTransfer:
            case UplinkRANStatusTransfer:
            case UplinkUEAssociatedNRPPaTransport:
            case WriteReplaceWarningRequest:
                return NgapPduDescription.INITIATING_MESSAGE;

            case AMFConfigurationUpdateAcknowledge:
            case HandoverCancelAcknowledge:
            case HandoverCommand:
            case HandoverRequestAcknowledge:
            case InitialContextSetupResponse:
            case NGResetAcknowledge:
            case NGSetupResponse:
            case PathSwitchRequestAcknowledge:
            case PDUSessionResourceModifyResponse:
            case PDUSessionResourceModifyConfirm:
            case PDUSessionResourceReleaseResponse:
            case PDUSessionResourceSetupResponse:
            case PWSCancelResponse:
            case RANConfigurationUpdateAcknowledge:
            case UEContextModificationResponse:
            case UEContextReleaseComplete:
            case UERadioCapabilityCheckResponse:
            case WriteReplaceWarningResponse:
                return NgapPduDescription.SUCCESSFUL_OUTCOME;

            case AMFConfigurationUpdateFailure:
            case HandoverPreparationFailure:
            case HandoverFailure:
            case InitialContextSetupFailure:
            case NGSetupFailure:
            case PathSwitchRequestFailure:
            case RANConfigurationUpdateFailure:
            case UEContextModificationFailure:
                return NgapPduDescription.UNSUCCESSFUL_OUTCOME;

            default:
                throw new RuntimeException();
        }
    }
}
