package com.travelzen.farerule.exchange.task;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.travelzen.farerule.exchange.consts.ExchangeConst;

public class ExchangeYahooTask implements Runnable {

private static final Logger log = LoggerFactory.getLogger(ExchangeFetchTask.class);
	
	private static int count = 0;

	@Override
	public void run() {
		/**
		 * The request String is generated from https://developer.yahoo.com/yql/console/
		 * u: tz.exchange
		 * p: travelzen1415
		 * 
		 * select * from yahoo.finance.xchange where pair in ("AEDCNY","AFNCNY","ALLCNY","AMDCNY","ANGCNY","AOACNY","ARSCNY","AUDCNY","AWGCNY","AZMCNY","BAMCNY","BBDCNY","BDTCNY","BGNCNY","BHDCNY","BIFCNY","BMDCNY","BNDCNY","BOBCNY","BOVCNY","BRLCNY","BSDCNY","BTNCNY","BWPCNY","BYRCNY","BZDCNY","CADCNY","CDFCNY","CHFCNY","CLFCNY","CLPCNY","CNYCNY","COPCNY","COUCNY","CRCCNY","CSDCNY","CUPCNY","CVECNY","CYPCNY","CZKCNY","DJFCNY","DKKCNY","DOPCNY","DZDCNY","ECUCNY","EEKCNY","EGPCNY","ERNCNY","ETBCNY","EURCNY","FJDCNY","FKPCNY","GBPCNY","GELCNY","GHCCNY","GIPCNY","GMDCNY","GNFCNY","GTQCNY","GYDCNY","HKDCNY","HNLCNY","HRKCNY","HTGCNY","HUFCNY","IDRCNY","ILSCNY","INRCNY","IQDCNY","IRRCNY","ISKCNY","JMDCNY","JODCNY","JPYCNY","KESCNY","KGSCNY","KHRCNY","KMFCNY","KPWCNY","KRWCNY","KWDCNY","KYDCNY","KZTCNY","LAKCNY","LBPCNY","LKRCNY","LRDCNY","LSLCNY","LTLCNY","LVLCNY","LYDCNY","MADCNY","MDLCNY","MGACNY","MKDCNY","MMKCNY","MNTCNY","MOPCNY","MROCNY","MTLCNY","MURCNY","MVRCNY","MWKCNY","MXNCNY","MXVCNY","MYRCNY","MZMCNY","NADCNY","NGNCNY","NIOCNY","NOKCNY","NPRCNY","NZDCNY","OMRCNY","PABCNY","PENCNY","PGKCNY","PHPCNY","PKRCNY","PLNCNY","PYGCNY","QARCNY","ROLCNY","RUBCNY","RWFCNY","SARCNY","SBDCNY","SCRCNY","SDDCNY","SEKCNY","SGDCNY","SHPCNY","SITCNY","SKKCNY","SLLCNY","SOSCNY","SRDCNY","STDCNY","SVCCNY","SYPCNY","SZLCNY","THBCNY","TJSCNY","TMMCNY","TNDCNY","TOPCNY","TRLCNY","TRYCNY","TTDCNY","TWDCNY","TZSCNY","UAHCNY","UGXCNY","USDCNY","USNCNY","USSCNY","UYUCNY","UZSCNY","VEBCNY","VNDCNY","VUVCNY","WSTCNY","XAFCNY","XAGCNY","XAUCNY","XCDCNY","XOFCNY","XPFCNY","YERCNY","ZARCNY","ZMKCNY","ZWDCNY")
		 * select * from yahoo.finance.xchange where pair in ("AEDCNY","AFNCNY","ALLCNY","AMDCNY","ANGCNY","AOACNY","ARSCNY","AUDCNY","AWGCNY","AZMCNY","BAMCNY","BBDCNY","BDTCNY","BGNCNY","BHDCNY","BIFCNY","BMDCNY","BNDCNY","BOBCNY","BOVCNY","BRLCNY","BSDCNY","BTNCNY","BWPCNY","BYRCNY","BZDCNY","CADCNY","CDFCNY","CHFCNY","CLFCNY","CLPCNY","CNYCNY","COPCNY","COUCNY","CRCCNY","CSDCNY","CUPCNY","CVECNY","CZKCNY","DJFCNY","DKKCNY","DOPCNY","DZDCNY","ECUCNY","EGPCNY","ERNCNY","ETBCNY","EURCNY","FJDCNY","FKPCNY","GBPCNY","GELCNY","GIPCNY","GMDCNY","GNFCNY","GTQCNY","GYDCNY","HKDCNY","HNLCNY","HRKCNY","HTGCNY","HUFCNY","IDRCNY","ILSCNY","INRCNY","IQDCNY","IRRCNY","ISKCNY","JMDCNY","JODCNY","JPYCNY","KESCNY","KGSCNY","KHRCNY","KMFCNY","KPWCNY","KRWCNY","KWDCNY","KYDCNY","KZTCNY","LAKCNY","LBPCNY","LKRCNY","LRDCNY","LSLCNY","LTLCNY","LVLCNY","LYDCNY","MADCNY","MDLCNY","MGACNY","MKDCNY","MMKCNY","MNTCNY","MOPCNY","MROCNY","MURCNY","MVRCNY","MWKCNY","MXNCNY","MXVCNY","MYRCNY","NADCNY","NGNCNY","NIOCNY","NOKCNY","NPRCNY","NZDCNY","OMRCNY","PABCNY","PENCNY","PGKCNY","PHPCNY","PKRCNY","PLNCNY","PYGCNY","QARCNY","RUBCNY","RWFCNY","SARCNY","SBDCNY","SCRCNY","SEKCNY","SGDCNY","SHPCNY","SLLCNY","SOSCNY","SRDCNY","STDCNY","SVCCNY","SYPCNY","SZLCNY","THBCNY","TJSCNY","TMMCNY","TNDCNY","TOPCNY","TRYCNY","TTDCNY","TWDCNY","TZSCNY","UAHCNY","UGXCNY","USDCNY","USNCNY","USSCNY","UYUCNY","UZSCNY","VNDCNY","VUVCNY","WSTCNY","XAFCNY","XCDCNY","XOFCNY","XPFCNY","YERCNY","ZARCNY","ZMKCNY")
		 */
		String request = "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20(%22AEDCNY%22%2C%22AFNCNY%22%2C%22ALLCNY%22%2C%22AMDCNY%22%2C%22ANGCNY%22%2C%22AOACNY%22%2C%22ARSCNY%22%2C%22AUDCNY%22%2C%22AWGCNY%22%2C%22AZMCNY%22%2C%22BAMCNY%22%2C%22BBDCNY%22%2C%22BDTCNY%22%2C%22BGNCNY%22%2C%22BHDCNY%22%2C%22BIFCNY%22%2C%22BMDCNY%22%2C%22BNDCNY%22%2C%22BOBCNY%22%2C%22BOVCNY%22%2C%22BRLCNY%22%2C%22BSDCNY%22%2C%22BTNCNY%22%2C%22BWPCNY%22%2C%22BYRCNY%22%2C%22BZDCNY%22%2C%22CADCNY%22%2C%22CDFCNY%22%2C%22CHFCNY%22%2C%22CLFCNY%22%2C%22CLPCNY%22%2C%22CNYCNY%22%2C%22COPCNY%22%2C%22COUCNY%22%2C%22CRCCNY%22%2C%22CSDCNY%22%2C%22CUPCNY%22%2C%22CVECNY%22%2C%22CZKCNY%22%2C%22DJFCNY%22%2C%22DKKCNY%22%2C%22DOPCNY%22%2C%22DZDCNY%22%2C%22ECUCNY%22%2C%22EGPCNY%22%2C%22ERNCNY%22%2C%22ETBCNY%22%2C%22EURCNY%22%2C%22FJDCNY%22%2C%22FKPCNY%22%2C%22GBPCNY%22%2C%22GELCNY%22%2C%22GIPCNY%22%2C%22GMDCNY%22%2C%22GNFCNY%22%2C%22GTQCNY%22%2C%22GYDCNY%22%2C%22HKDCNY%22%2C%22HNLCNY%22%2C%22HRKCNY%22%2C%22HTGCNY%22%2C%22HUFCNY%22%2C%22IDRCNY%22%2C%22ILSCNY%22%2C%22INRCNY%22%2C%22IQDCNY%22%2C%22IRRCNY%22%2C%22ISKCNY%22%2C%22JMDCNY%22%2C%22JODCNY%22%2C%22JPYCNY%22%2C%22KESCNY%22%2C%22KGSCNY%22%2C%22KHRCNY%22%2C%22KMFCNY%22%2C%22KPWCNY%22%2C%22KRWCNY%22%2C%22KWDCNY%22%2C%22KYDCNY%22%2C%22KZTCNY%22%2C%22LAKCNY%22%2C%22LBPCNY%22%2C%22LKRCNY%22%2C%22LRDCNY%22%2C%22LSLCNY%22%2C%22LTLCNY%22%2C%22LVLCNY%22%2C%22LYDCNY%22%2C%22MADCNY%22%2C%22MDLCNY%22%2C%22MGACNY%22%2C%22MKDCNY%22%2C%22MMKCNY%22%2C%22MNTCNY%22%2C%22MOPCNY%22%2C%22MROCNY%22%2C%22MURCNY%22%2C%22MVRCNY%22%2C%22MWKCNY%22%2C%22MXNCNY%22%2C%22MXVCNY%22%2C%22MYRCNY%22%2C%22NADCNY%22%2C%22NGNCNY%22%2C%22NIOCNY%22%2C%22NOKCNY%22%2C%22NPRCNY%22%2C%22NZDCNY%22%2C%22OMRCNY%22%2C%22PABCNY%22%2C%22PENCNY%22%2C%22PGKCNY%22%2C%22PHPCNY%22%2C%22PKRCNY%22%2C%22PLNCNY%22%2C%22PYGCNY%22%2C%22QARCNY%22%2C%22RUBCNY%22%2C%22RWFCNY%22%2C%22SARCNY%22%2C%22SBDCNY%22%2C%22SCRCNY%22%2C%22SEKCNY%22%2C%22SGDCNY%22%2C%22SHPCNY%22%2C%22SLLCNY%22%2C%22SOSCNY%22%2C%22SRDCNY%22%2C%22STDCNY%22%2C%22SVCCNY%22%2C%22SYPCNY%22%2C%22SZLCNY%22%2C%22THBCNY%22%2C%22TJSCNY%22%2C%22TMMCNY%22%2C%22TNDCNY%22%2C%22TOPCNY%22%2C%22TRYCNY%22%2C%22TTDCNY%22%2C%22TWDCNY%22%2C%22TZSCNY%22%2C%22UAHCNY%22%2C%22UGXCNY%22%2C%22USDCNY%22%2C%22USNCNY%22%2C%22USSCNY%22%2C%22UYUCNY%22%2C%22UZSCNY%22%2C%22VNDCNY%22%2C%22VUVCNY%22%2C%22WSTCNY%22%2C%22XAFCNY%22%2C%22XCDCNY%22%2C%22XOFCNY%22%2C%22XPFCNY%22%2C%22YERCNY%22%2C%22ZARCNY%22%2C%22ZMKCNY%22)&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys&callback=";

		while (true) {
			try {
				log.info("Start fetching exchange...(" + ++count +")");
				URL url = new URL(request);
				BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
				StringBuilder sb = new StringBuilder();
				String line = "";
				while ((line = reader.readLine()) != null) {
					sb.append(line);
				}
				Matcher matcher = Pattern.compile("\"([A-Z]{3}) to [A-Z]{3}\",\"Rate\":\"(\\d+\\.\\d+)\"").matcher(sb.toString());
				while (matcher.find()) {
					String currency = matcher.group(1);
					double rate = Double.parseDouble(matcher.group(2));
//					System.out.println(currency + " " + rate);
					ExchangeConst.exchangeMap.put(currency, rate);
				}
				log.info("Exchange fetching finish! (" + count + ")");
				Thread.sleep(1800000);
			} catch (Exception e) {
				log.info("Exchange Fetching Error!", e);
				break;
			}
		}
	}
}
