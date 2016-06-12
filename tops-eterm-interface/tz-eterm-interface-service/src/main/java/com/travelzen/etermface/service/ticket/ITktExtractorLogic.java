package com.travelzen.etermface.service.ticket;

import com.travelzen.etermface.service.PNRParser.RtInfoBean;
import com.travelzen.etermface.service.entity.PnrRet;

public interface ITktExtractorLogic {
	public void handle(RtInfoBean rtInfoBean, String[] lines, int startLineIdx, PnrRet pnrRet);
}
