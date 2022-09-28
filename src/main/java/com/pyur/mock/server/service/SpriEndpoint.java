package com.pyur.mock.server.service;

import de.telekom.spri.oss.v4.envelope.AnnehmenAuftragRequestType;
import de.telekom.spri.oss.v4.envelope.AnnehmenAuftragResponseType;
import de.telekom.spri.oss.v4.envelope.AnnehmenMeldungRequestType;
import de.telekom.spri.oss.v4.envelope.AnnehmenMeldungResponseType;
import de.xconnect.bus.api.*;
import lombok.RequiredArgsConstructor;
import org.apache.cxf.feature.Features;
import org.springframework.stereotype.Service;

import static de.xconnect.bus.api.InhouseResponseCode.OK;

@Service
@RequiredArgsConstructor
@Features(features = "org.apache.cxf.ext.logging.LoggingFeature")
public class SpriEndpoint implements Spri40InhouseServicePort {

  private static final String DEFAULT_RESPONSE = "Auftrag wurde verarbeitet.";

  @Override
  public InhouseResponse annehmenMeldungResponse (AnnehmenMeldungResponseType annehmenMeldungResponse,
      InhouseMeta inhouseMeta) throws Exception_Exception {
    return ok();
  }

  @Override
  public InhouseResponse annehmenMeldungRequest (AnnehmenMeldungRequestType annehmenMeldungRequest,
      InhouseMeta inhouseMeta) throws Exception_Exception {
    return ok();
  }

  @Override
  public InhouseResponse annehmenAuftragRequest (AnnehmenAuftragRequestType annehmenAuftragRequest,
      InhouseMeta inhouseMeta) throws Exception_Exception {
    return ok();
  }

  @Override
  public InhouseResponse annehmenAuftragResponse (AnnehmenAuftragResponseType annehmenAuftragResponse,
      InhouseMeta inhouseMeta) throws Exception_Exception {
    return ok();
  }

  private static InhouseResponse ok () {
    InhouseResponse response = new InhouseResponse();
    response.setDescription(DEFAULT_RESPONSE);
    response.setInhouseResponseCode(OK);
    return response;
  }

}
