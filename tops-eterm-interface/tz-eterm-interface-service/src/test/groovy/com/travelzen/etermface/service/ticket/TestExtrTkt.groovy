package com.travelzen.etermface.service.ticket

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import com.thoughtworks.xstream.XStream
import com.thoughtworks.xstream.io.naming.NoNameCoder
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter
import com.thoughtworks.xstream.io.xml.StaxDriver
import com.travelzen.etermface.service.PNRParser;
import com.travelzen.etermface.service.PNRParser.FlightResult
import com.travelzen.etermface.service.PNRParser.RtInfoBean
import com.travelzen.etermface.service.entity.PnrRet
import com.travelzen.etermface.service.entity.RtInterceptorBean
import com.travelzen.etermface.service.handler.RtBeforeParserHandler
import com.travelzen.etermface.service.ticket.TicketExtractorHandler;

@RunWith(Parameterized)
class TestExtrTkt {

	@Before void setUp() {
		rtParserHandlerList.add( new TicketExtractorHandler() )


		StaxDriver sd = new StaxDriver(new NoNameCoder());
		xstream = new XStream(sd);

		xstream.processAnnotations(PnrRet.class);
	}

	PNRParser  parser = new PNRParser()

	FlightResult flightResult = new FlightResult()
	List<RtBeforeParserHandler> rtParserHandlerList = new ArrayList()

	XStream xstream
	String param

	def expectedResult

	@Parameters static data() {

		def  testCase =[
'''MARRIED SEGMENT EXIST IN THE PNR

  **ELECTRONIC TICKET PNR** 
 1.CHEN/LI MS 2.XU/BIN MR 3.XU/JIANI CHD 4.XU/LEHAN CHD HWJQJE  
 5.  SQ827  H1  SU28JUL  PVGSIN HK4   0805 1325          E  
 6.  SQ462  H1  WE31JUL  SINMLE HK4   1005 1135          E  
 7.  SQ461  N2  SU04AUG  MLESIN HK4   1420 2205          E  
 8.  SQ826  N2  MO05AUG  SINPVG HK4   0115 0635          E  
 9.SHA/T SHA/T 021-62491919/SHA LING XIANG BUINESS SERVICE CO.,LTD/YANG ER  
     LING ABCDEFG   
10.*  
11.*  
12.T                                                                           
13.SSR SEAT SQ HK4 PVGSIN 827 H28JUL 48KN48JN48HN48GN/P1/2/3/4                 
14.SSR SEAT SQ HK4 SINMLE 462 H31JUL 41GN41FN41EN41DN/P1/2/3/4  
15.SSR SEAT SQ HK4 MLESIN 461 N04AUG 51CN51AN52AN52CN/P1/2/3/4  
16.SSR SEAT SQ HK4 SINPVG 826 N05AUG 51BN51CN51AN51DN/P1/2/3/4  
17.SSR OTHS 1E DUPLICATED WITH 3UIXKL 10 3  
18.SSR ADTK 1E TO SQ BY 18JUN 1600 OTHERWISE WILL BE XLD
19.SSR TKNE SQ HK1 PVGSIN 827 H28JUL 6184132436804/1/P4 
20.SSR TKNE SQ HK1 PVGSIN 827 H28JUL 6184132436803/1/P3 
21.SSR TKNE SQ HK1 PVGSIN 827 H28JUL 6184132436799/1/P2 
22.SSR TKNE SQ HK1 PVGSIN 827 H28JUL 6184132436798/1/P1 
23.SSR TKNE SQ HK1 SINMLE 462 H31JUL 6184132436798/2/P1 
24.SSR TKNE SQ HK1 MLESIN 461 N04AUG 6184132436798/3/P1                        
25.SSR TKNE SQ HK1 SINPVG 826 N05AUG 6184132436798/4/P1                        
26.SSR TKNE SQ HK1 SINMLE 462 H31JUL 6184132436799/2/P2 
27.SSR TKNE SQ HK1 MLESIN 461 N04AUG 6184132436799/3/P2 
28.SSR TKNE SQ HK1 SINPVG 826 N05AUG 6184132436799/4/P2 
29.SSR TKNE SQ HK1 SINMLE 462 H31JUL 6184132436803/2/P3 
30.SSR TKNE SQ HK1 MLESIN 461 N04AUG 6184132436803/3/P3 
31.SSR TKNE SQ HK1 SINPVG 826 N05AUG 6184132436803/4/P3 
32.SSR TKNE SQ HK1 SINMLE 462 H31JUL 6184132436804/2/P4 
33.SSR TKNE SQ HK1 MLESIN 461 N04AUG 6184132436804/3/P4 
34.SSR TKNE SQ HK1 SINPVG 826 N05AUG 6184132436804/4/P4 
35.SSR DOCS   
36.SSR DOCS                                                                    
37.SSR DOCS                                                                    
38.SSR DOCS   
39.OSI CTC    
40.RMK TJ SHA255
41.RMK 1A/X9OXYP
42.RMK TJ AUTH SHA255   
43.FN/IT//SCNY3580.00/C0.00/XCNY2949.00/TEXEMPTCN/TCNY114.00BQ/TCNY2835.00XT
    /P3/4     
44.FN/A/IT//SCNY4100.00/C0.00/XCNY3039.00/TCNY90.00CN/TCNY114.00BQ/TCNY2835.00XT      
45.TN/618-4132436798/P1 
46.TN/618-4132436799/P2                                                        
47.TN/618-4132436803/P3                                                        
48.TN/618-4132436804/P4 
49.FP/CASH,CNY/AGT08307736 QS-- 
50.SHA777
[main] c.t.etermface.PNRParser-[PNRParser.java:513] :

BeginRT>>>:HWJQJE
  MARRIED SEGMENT EXIST IN THE PNR
  **ELECTRONIC TICKET PNR** 
 1.CHEN/LI MS 2.XU/BIN MR 3.XU/JIANI CHD 4.XU/LEHAN CHD HWJQJE  
 5.  SQ827  H1  SU28JUL  PVGSIN HK4   0805 1325          E  
 6.  SQ462  H1  WE31JUL  SINMLE HK4   1005 1135          E  
 7.  SQ461  N2  SU04AUG  MLESIN HK4   1420 2205          E  
 8.  SQ826  N2  MO05AUG  SINPVG HK4   0115 0635          E  
 9.SHA/T SHA/T 021-62491919/SHA LING XIANG BUINESS SERVICE CO.,LTD/YANG ER  
     LING ABCDEFG   
10.*  
11.*  
12.T                                                                           
13.SSR SEAT SQ HK4 PVGSIN 827 H28JUL 48KN48JN48HN48GN/P1/2/3/4                 
14.SSR SEAT SQ HK4 SINMLE 462 H31JUL 41GN41FN41EN41DN/P1/2/3/4  
15.SSR SEAT SQ HK4 MLESIN 461 N04AUG 51CN51AN52AN52CN/P1/2/3/4  
16.SSR SEAT SQ HK4 SINPVG 826 N05AUG 51BN51CN51AN51DN/P1/2/3/4  
17.SSR OTHS 1E DUPLICATED WITH 3UIXKL 10 3  
18.SSR ADTK 1E TO SQ BY 18JUN 1600 OTHERWISE WILL BE XLD
19.SSR TKNE SQ HK1 PVGSIN 827 H28JUL 6184132436804/1/P4 
20.SSR TKNE SQ HK1 PVGSIN 827 H28JUL 6184132436803/1/P3 
21.SSR TKNE SQ HK1 PVGSIN 827 H28JUL 6184132436799/1/P2 
22.SSR TKNE SQ HK1 PVGSIN 827 H28JUL 6184132436798/1/P1 
23.SSR TKNE SQ HK1 SINMLE 462 H31JUL 6184132436798/2/P1 
24.SSR TKNE SQ HK1 MLESIN 461 N04AUG 6184132436798/3/P1                        
25.SSR TKNE SQ HK1 SINPVG 826 N05AUG 6184132436798/4/P1                        
26.SSR TKNE SQ HK1 SINMLE 462 H31JUL 6184132436799/2/P2 
27.SSR TKNE SQ HK1 MLESIN 461 N04AUG 6184132436799/3/P2 
28.SSR TKNE SQ HK1 SINPVG 826 N05AUG 6184132436799/4/P2 
29.SSR TKNE SQ HK1 SINMLE 462 H31JUL 6184132436803/2/P3 
30.SSR TKNE SQ HK1 MLESIN 461 N04AUG 6184132436803/3/P3 
31.SSR TKNE SQ HK1 SINPVG 826 N05AUG 6184132436803/4/P3 
32.SSR TKNE SQ HK1 SINMLE 462 H31JUL 6184132436804/2/P4 
33.SSR TKNE SQ HK1 MLESIN 461 N04AUG 6184132436804/3/P4 
34.SSR TKNE SQ HK1 SINPVG 826 N05AUG 6184132436804/4/P4 
35.SSR DOCS   
36.SSR DOCS                                                                    
37.SSR DOCS                                                                    
38.SSR DOCS   
39.OSI CTC    
40.RMK TJ SHA255
41.RMK 1A/X9OXYP
42.RMK TJ AUTH SHA255   
43.FN/IT//SCNY3580.00/C0.00/XCNY2949.00/TEXEMPTCN/TCNY114.00BQ/TCNY2835.00XT
    /P3/4     
44.FN/A/IT//SCNY4100.00/C0.00/XCNY3039.00/TCNY90.00CN/TCNY114.00BQ/TCNY2835.00XT
      
45.TN/618-4132436798/P1 
46.TN/618-4132436799/P2                                                        
47.TN/618-4132436803/P3                                                        
48.TN/618-4132436804/P4 
49.FP/CASH,CNY/AGT08307736 QS-- 
50.SHA777'''

,			
'''    **ELECTRONIC TICKET PNR** 
 1.JIN/TONGDI 2.TSAI/CHINGHUNG 3.TSAI/YUTONGCHD HY3XZ8  
 4.  CI502  V   SU16JUN13PVGTPE HK3   1205 1350          E  
 5.  CI503  V   FR28JUN  TPEPVG HK3   1650 1835          E  
 6.SHA/T SHA/T021-36412780/SHANGHAI FENGRUI INDUSTRY CO.LTD/ZHAO YAN ZHONG  
     ABCDEFG  
 7.REM 0603 0827 87J24301   
 8.051255215798 
 9.T  
10.SSR ADTK 1E PLZ ADTK B4 1200/14JUN FR PVGTPECI0502V16JUN OR AUTO CANC EL 
     DZEND    
11.SSR ADTK 1E PLZ ADTK B4 1200/14JUN FR TPEPVGCI0501B15JUN OR AUTO CANC EL    
     DZEND    
12.SSR ADTK 1E PLZ ADVC PAX EMAIL ADDRESS N MOBILE PHONE NO FOR SKJ CHG INFO
13.SSR ADTK 1E BY SHA08JUN13/0828 OR CXL MU5007 R11JUN  
14.SSR OTHS 1E CI 502 16JUN ARRIVE AT TPE TERMINAL 2
15.SSR OTHS 1E CI 503 28JUN DEPART FROM TPE TERMINAL 2  
16.SSR TKNE CI HK1 PVGTPE 502 V16JUN 2974132436699/1/P3 
17.SSR TKNE CI HK1 PVGTPE 502 V16JUN 2974132436698/1/P2 
18.SSR TKNE CI HK1 PVGTPE 502 V16JUN INF2974132436697/1/P1  
19.SSR TKNE CI HK1 PVGTPE 502 V16JUN 2974132436696/1/P1 
20.SSR TKNE CI HK1 TPEPVG 503 V28JUN 2974132436696/2/P1 
21.SSR TKNE CI HK1 TPEPVG 503 V28JUN INF2974132436697/2/P1                     
22.SSR TKNE CI HK1 TPEPVG 503 V28JUN 2974132436698/2/P2                        
23.SSR TKNE CI HK1 TPEPVG 503 V28JUN 2974132436699/2/P3 
24.SSR DOCS   
25.SSR DOCS   
26.SSR DOCS   
27.SSR DOCS   
28.SSR INFT CI HK1 PVGTPE 502 V16JUN CAI/YUTING 11MAR12/P1  
29.SSR INFT CI HK1 TPEPVG 503 V28JUN CAI/YUTING 11MAR12/P1  
30.OSI YY CTCT051255215798  
31.OSI YY 1INF CAI/YUTING MISS/P1   
32.RMK TJ SHA255
33.RMK CI/K4EJ8Q                                                               
34.RMK TJ AUTH SHA255                                                          
35.FN/NR/FCNY3450.00/SCNY2200.00/C0.00/XCNY682.00/TCNY90.00CN/TCNY62.00TW/  
    TCNY530.00YQ/ACNY4132.00
36.FN/NR/FCNY2590.00/SCNY1650.00/C0.00/XCNY592.00/TEXEMPTCN/TCNY62.00TW/
    TCNY530.00YQ/ACNY3182.00/P3 
37.FN/A/IN/FCNY350.00/SCNY350.00/C5.00/TEXEMPTCN/ACNY350.00 
38.TN/297-4132436696/P1 
39.TN/IN/297-4132436697/P1  
40.TN/297-4132436698/P2 
41.TN/297-4132436699/P3 
42.FP/CASH,CNY  
43.FP/IN/CASH,CNY                                                              
44.XN/IN/CAI/YUTING MISS(MAR12)/P1                                             
45.SHA243'''			
			
,

'''    **ELECTRONIC TICKET PNR** 
 1.LIN/QUAN JZ39EK  
 2.  TK027  L   SU16JUN13PVGIST HK1   2245 0525+1    SEAME  
 3.  TK070  A   TU30JUL  ISTHKG HK1   0055 1620      SEAME  
 4.XMN/T XMN/T 0592-3989988/XIAMEN TOURISM GROUP INT TRAVEL SERVICE CO.,LTD/
    /WANG WEN QIN ABCDEFG   
 5.*  
 6.T  
 7.SSR OTHS   
 8.SSR TKNE   
 9.SSR TKNE   
10.SSR DOCS                                                                    
11.RMK TJ SHA255                                                               
12.RMK    
13.RMK    
14.RMK    
15.FN/A/FCNY6420.00/SCNY6420.00/C3.00/XCNY1907.00/TCNY90.00CN/TCNY93.00TR/  
    TCNY1724.00YR/ACNY8327.00   
16.TN/235-4132436836/P1 
17.XMN126'''			
			,
			
			
			//15.OSI 1E MUET TN/7812121563445-7812131563446
			'''**ELECTRONIC TICKET PNR**
 1.顾红蕾 2.陆文峰	JYR2VB
 3. *FM8238 N   SA11MAY13HKGSHA HK1   1535 1800          E --T1 OP-HX238
 3. *FM8238 N   SA11MAY13HKGSHA HK1   1535 1800          E --T1 OP-HX238
 4.REM 0507 1149 JINYI  
 5.13917521600  
 6.T  
 7.SSR ADTK 1E BY SHA07MAY13/1845 OR CXL FM 845 R08MAY  
10.SSR DOCS   
11.RMK TJ SHA255                                                               
12.RMK                                                                         
13.RMK    
14.RMK    
15.OSI 1E MUET TN/7812121563445
16.OSI 1E MUET TN/7812121563446
16.FP/CASH,CNY  
17.SHA868'''
			,
			//15.OSI 1E MUET TN/7812121563445-7812131563446
			'''**ELECTRONIC TICKET PNR**
 1.顾红蕾 2.陆文峰	JYR2VB
 3. *FM8238 N   SA11MAY13HKGSHA HK1   1535 1800          E --T1 OP-HX238
 4.REM 0507 1149 JINYI  
 5.13917521600  
 6.T  
 7.SSR ADTK 1E BY SHA07MAY13/1845 OR CXL FM 845 R08MAY  
 8.SSR TKNE FM HK1 SHAHKG 845 R08MAY 7812121563445/1/P1 
 9.SSR TKNE FM HK1 HKGSHA 8238 N11MAY 7812121563446/2/P1
10.SSR DOCS   
11.RMK TJ SHA255                                                               
12.RMK                                                                         
13.RMK    
14.RMK    
15.OSI 1E MUET TN/7812121563445
16.OSI 1E MUET TN/7812121563446
16.FP/CASH,CNY  
17.SHA868'''

			,
			//15.OSI 1E MUET TN/7812121563445-7812131563446
			'''**ELECTRONIC TICKET PNR**
 1.顾红蕾 2.陆文峰	JYR2VB
 3. *FM8238 N   SA11MAY13HKGSHA HK1   1535 1800          E --T1 OP-HX238
 4.REM 0507 1149 JINYI  
 5.13917521600  
 6.T  
 7.SSR ADTK 1E BY SHA07MAY13/1845 OR CXL FM 845 R08MAY  
 8.SSR TKNE FM HK1 SHAHKG 845 R08MAY 7743936980810/1/P1 
 9.SSR TKNE FM HK1 HKGSHA 8238 N11MAY 7743936980810/2/P1
10.SSR DOCS   
11.RMK TJ SHA255                                                               
12.RMK                                                                         
13.RMK    
14.RMK    
15.OSI 1E MUET TN/7812121563445-7812121563446
16.FP/CASH,CNY  
17.SHA868'''
			,
			// OSI 1E     1 ticket
			//14.OSI 1E MUET TN/7812133427202
			''' 1.黄旭东 HP442Y
 2.  FM9393 Y   MO17JUN  SHACSX RR1   1755 1945          E T2-- 
 3.SHA/T SHA/T021-62277798/BU YE CHENG BOOKING OFFICE/JINHUA ABCDEFG
 4.REM 0617 1035 88LB   
 5.0512-57579722
 6.TL/1555/17JUN/SHA255 
 7.SSR FOID FM HK1 NI320405196110160212/P1  
 8.SSR OTHS 1E PNRETDZED
 9.SSR OTHS 1E MU   
10.SSR CKIN FM  
11.SSR FQTV FM HK1 SHACSX 9393 Y17JUN MU640280527802/P1 
12.SSR ADTK 1E BY SHA17JUN13/1335 OR CXL FM9393 Y17JUN                         
13.OSI FM CTCT15806261293                                                      
14.OSI 1E MUET TN/7812133427202 
15.RMK CA/NJDMF7
16.SHA255'''
			,
			// OSI 1E     2 tickets
			//14.OSI 1E MUET TN/7812133427202-7812133427203
			''' 1.顾红蕾 2.陆文峰 HP442Y
 2.  FM9393 Y   MO17JUN  SHACSX RR1   1755 1945          E T2-- 
 3.SHA/T SHA/T021-62277798/BU YE CHENG BOOKING OFFICE/JINHUA ABCDEFG
 4.REM 0617 1035 88LB   
 5.0512-57579722
 6.TL/1555/17JUN/SHA255 
 7.SSR FOID FM HK1 NI320405196110160212/P1  
 8.SSR OTHS 1E PNRETDZED
 9.SSR OTHS 1E MU   
10.SSR CKIN FM  
11.SSR FQTV FM HK1 SHACSX 9393 Y17JUN MU640280527802/P1 
12.SSR ADTK 1E BY SHA17JUN13/1335 OR CXL FM9393 Y17JUN                         
13.OSI FM CTCT15806261293                                                      
14.OSI 1E MUET TN/7812133427202-7812133427203 
15.RMK CA/NJDMF7
16.SHA255'''
			,
			//13.TN/217-3936938174/P1
			//14.TN/217-3936938175/P2
			'''1.顾红蕾 2.陆文峰 HGVFZM   
 2.  TG665  H   TH16MAY  PVGBKK HK1   1725 2100          E  
 3.SHA/T SHA/T-4006896268 /SHA DONG LI BUSINESS LTD.,CO/TANG/ZHEN FENG ABCDEFG   4.*  
 5.T  
 6.SSR FQTV TG HK/ TG8113043587/P1  
 7.SSR DOCS   
 8.SSR OTHS 1E TG 665 16MAY OPS BY A/C 77B C42Y306 CREW N A/C ENGINERR BLOCK
     SEATS 1Y S/2013 01MAR13
 9.OSI TG TKNM 2173936938174/P1 
10.RMK TJ SHA255
11.RMK                                                                         
12.RMK                                                                         
13.TN/217-3936938174/P1 
13.TN/217-3936938175/P2
14.FP/CASH,CNY  
15.SHA697
'''
			,
			//16.TN/774-3936980810/P1
			'''**ELECTRONIC TICKET PNR**
 1.ANSALDONAVASQUES/ALVARO HGVYHR   
 2. *FM8238 N   SA11MAY13HKGSHA HK1   1535 1800          E --T1 OP-HX238
 3.SHA/T SHA/T 021-62496201/SHA JINGYAN AGENCO/ZHANG RL ABCDEFG 
 4.REM 0507 1149 JINYI  
 5.13917521600  
 6.T  
 7.SSR ADTK 1E BY SHA07MAY13/1845 OR CXL FM 845 R08MAY  
 8.SSR TKNE FM HK1 SHAHKG 845 R08MAY 7743936980810/1/P1 
 9.SSR TKNE FM HK1 HKGSHA 8238 N11MAY 7743936980810/2/P1
10.SSR DOCS   
11.RMK TJ SHA255                                                               
12.RMK                                                                         
13.RMK    
14.RMK    
15.FN/A/FCNY1860.00/SCNY1860.00/C5.00/XCNY528.00/TCNY90.00CN/TCNY96.00HK/   
    TCNY342.00YQ/ACNY2388.00
16.TN/774-3936980810/P1 
17.FP/CASH,CNY  
18.SHA868'''
			,
			// 6.T MFE/T TN/7312370506376
			'''**ELECTRONIC TICKET PNR**
 1.ANSALDONAVASQUES/ALVARO HGVYHR   
 2. *FM8238 N   SA11MAY13HKGSHA HK1   1535 1800          E --T1 OP-HX238
 3.SHA/T SHA/T 021-62496201/SHA JINGYAN AGENCO/ZHANG RL ABCDEFG 
 4.REM 0507 1149 JINYI  
 5.13917521600  
 6.T MFE/T TN/7312370506376 
 7.SSR ADTK 1E BY SHA07MAY13/1845 OR CXL FM 845 R08MAY  
 8.SSR TKNE FM HK1 SHAHKG 845 R08MAY 7743936980810/1/P1 
 9.SSR TKNE FM HK1 HKGSHA 8238 N11MAY 7743936980810/2/P1
10.SSR DOCS   
11.RMK TJ SHA255                                                               
15.FN/A/FCNY1860.00/SCNY1860.00/C5.00/XCNY528.00/TCNY90.00CN/TCNY96.00HK/   
    TCNY342.00YQ/ACNY2388.00
17.FP/CASH,CNY  
18.SHA868'''
			,
			// 6.T MFE/T TN/7312370506376-7312370506377
			'''**ELECTRONIC TICKET PNR**
 1.ANSALDONAVASQUES/ALVARO HGVYHR   
 2. *FM8238 N   SA11MAY13HKGSHA HK1   1535 1800          E --T1 OP-HX238
 3.SHA/T SHA/T 021-62496201/SHA JINGYAN AGENCO/ZHANG RL ABCDEFG 
 4.REM 0507 1149 JINYI  
 5.13917521600  
 6.T MFE/T TN/7312370506376-7312370506377 
 7.SSR ADTK 1E BY SHA07MAY13/1845 OR CXL FM 845 R08MAY  
 8.SSR TKNE FM HK1 SHAHKG 845 R08MAY 7743936980810/1/P1 
 9.SSR TKNE FM HK1 HKGSHA 8238 N11MAY 7743936980810/2/P1
10.SSR DOCS   
11.RMK TJ SHA255                                                               
15.FN/A/FCNY1860.00/SCNY1860.00/C5.00/XCNY528.00/TCNY90.00CN/TCNY96.00HK/   
    TCNY342.00YQ/ACNY2388.00
17.FP/CASH,CNY  
18.SHA868'''

			,
			//  6.T/7312370506377
			'''**ELECTRONIC TICKET PNR**
 1.ANSALDONAVASQUES/ALVARO HGVYHR   
 2. *FM8238 N   SA11MAY13HKGSHA HK1   1535 1800          E --T1 OP-HX238
 3.SHA/T SHA/T 021-62496201/SHA JINGYAN AGENCO/ZHANG RL ABCDEFG 
 4.REM 0507 1149 JINYI  
 5.13917521600  
 6.T/7312370506377 
 7.SSR ADTK 1E BY SHA07MAY13/1845 OR CXL FM 845 R08MAY  
 8.SSR TKNE FM HK1 SHAHKG 845 R08MAY 7743936980810/1/P1 
 9.SSR TKNE FM HK1 HKGSHA 8238 N11MAY 7743936980810/2/P1
10.SSR DOCS   
11.RMK TJ SHA255                                                               
15.FN/A/FCNY1860.00/SCNY1860.00/C5.00/XCNY528.00/TCNY90.00CN/TCNY96.00HK/   
    TCNY342.00YQ/ACNY2388.00
17.FP/CASH,CNY  
18.SHA868'''
			,
			//  6.T/7312370506377-7312370506378
			''' 1.顾红蕾 2.陆文峰 HGVFZM
 2.  TG665  H   TH16MAY  PVGBKK HK1   1725 2100          E  
 3.SHA/T SHA/T-4006896268 /SHA DONG LI BUSINESS LTD.,CO/TANG/ZHEN FENG ABCDEFG   4.*  
 5.T  
 6.SSR FQTV TG HK/ TG8113043587/P1  
 7.SSR DOCS   
 8.SSR OTHS 1E TG 665 16MAY OPS BY A/C 77B C42Y306 CREW N A/C ENGINERR BLOCK
     SEATS 1Y S/2013 01MAR13
 9.OSI TG TKNM 2173936938174/P1 
10.RMK TJ SHA255
14.FP/CASH,CNY  
15.SHA697
'''
,
//group
'''    **ELECTRONIC TICKET PNR** 
 0.20SHA NM20 JYNE4W
 1.CHENG/LIN 2.GAO/YUQI 3.GU/GUOQIANG 4.JIANG/CHUNYAN 5.JIANG/JINRONG   
 6.JIANG/XUEJI 7.LI/NAN 8.PANG/ZHEMIN 9.REN/JIAYU CHD 10.WANG/CHUNYAN   
11.XU/JIANSHI 12.ZHANG/JIAN 13.ZHANG/LEI 14.ZHANG/LIAO CHD 15.ZHANG/QIN 
16.ZHANG/XINGCHEN CHD 17.ZHENG/LIJING 18.ZHENG/YIZHI 19.ZHOU/RUYI   
20.ZHU/XIANGQIAN
21.  FM839  V   FR21JUN  PVGBKK RR20  0855 1230          E T1-- 
22.  FM856  V   WE26JUN  BKKPVG HK20  1955 0100+1        E --T1 
23.50299  
24.64730202 1381650808  
25.T                                                                           
26.SSR OTHS 1E PLS ISSUE TKT BEF AM08 30 17JUN OR CNL                          
27.SSR OTHS 1E PLS ISSUE NM BEF AM08 30 11JUN OR CNL
28.SSR OTHS 1E PLS ISSUE TKT BEF AM08 30 17JUN OR CNL   
29.SSR ADTK CA BY SHA17JUN13/0855 OR CXL FM 839 V21JUN  
30.SSR TKNE FM HK1 PVGBKK 839 V21JUN 7744132436881/1/P20
31.SSR TKNE FM HK1 PVGBKK 839 V21JUN 7744132436880/1/P19
32.SSR TKNE FM HK1 PVGBKK 839 V21JUN 7744132436879/1/P18
33.SSR TKNE FM HK1 PVGBKK 839 V21JUN 7744132436878/1/P17
34.SSR TKNE FM HK1 PVGBKK 839 V21JUN 7744132436877/1/P16
35.SSR TKNE FM HK1 PVGBKK 839 V21JUN 7744132436876/1/P15
36.SSR TKNE FM HK1 PVGBKK 839 V21JUN 7744132436875/1/P14
37.SSR TKNE FM HK1 PVGBKK 839 V21JUN 7744132436874/1/P13                       
38.SSR TKNE FM HK1 PVGBKK 839 V21JUN 7744132436873/1/P12                       
39.SSR TKNE FM HK1 PVGBKK 839 V21JUN 7744132436872/1/P11
40.SSR TKNE FM HK1 PVGBKK 839 V21JUN 7744132436871/1/P10
41.SSR TKNE FM HK1 PVGBKK 839 V21JUN 7744132436870/1/P9 
42.SSR TKNE FM HK1 PVGBKK 839 V21JUN 7744132436869/1/P8 
43.SSR TKNE FM HK1 PVGBKK 839 V21JUN 7744132436868/1/P7 
44.SSR TKNE FM HK1 PVGBKK 839 V21JUN 7744132436867/1/P6 
45.SSR TKNE FM HK1 PVGBKK 839 V21JUN 7744132436866/1/P5 
46.SSR TKNE FM HK1 PVGBKK 839 V21JUN 7744132436865/1/P4 
47.SSR TKNE FM HK1 PVGBKK 839 V21JUN 7744132436864/1/P3 
48.SSR TKNE FM HK1 PVGBKK 839 V21JUN 7744132436863/1/P2 
49.SSR TKNE FM HK1 PVGBKK 839 V21JUN 7744132436862/1/P1                        
50.SSR TKNE FM HK1 BKKPVG 856 V26JUN 7744132436862/2/P1                        
51.SSR TKNE FM HK1 BKKPVG 856 V26JUN 7744132436863/2/P2 
52.SSR TKNE FM HK1 BKKPVG 856 V26JUN 7744132436864/2/P3 
53.SSR TKNE FM HK1 BKKPVG 856 V26JUN 7744132436865/2/P4 
54.SSR TKNE FM HK1 BKKPVG 856 V26JUN 7744132436866/2/P5 
55.SSR TKNE FM HK1 BKKPVG 856 V26JUN 7744132436867/2/P6 
56.SSR TKNE FM HK1 BKKPVG 856 V26JUN 7744132436868/2/P7 
57.SSR TKNE FM HK1 BKKPVG 856 V26JUN 7744132436869/2/P8 
58.SSR TKNE FM HK1 BKKPVG 856 V26JUN 7744132436870/2/P9 
59.SSR TKNE FM HK1 BKKPVG 856 V26JUN 7744132436871/2/P10
60.SSR TKNE FM HK1 BKKPVG 856 V26JUN 7744132436872/2/P11
61.SSR TKNE FM HK1 BKKPVG 856 V26JUN 7744132436873/2/P12                       
62.SSR TKNE FM HK1 BKKPVG 856 V26JUN 7744132436874/2/P13                       
63.SSR TKNE FM HK1 BKKPVG 856 V26JUN 7744132436875/2/P14
64.SSR TKNE FM HK1 BKKPVG 856 V26JUN 7744132436876/2/P15
65.SSR TKNE FM HK1 BKKPVG 856 V26JUN 7744132436877/2/P16
66.SSR TKNE FM HK1 BKKPVG 856 V26JUN 7744132436878/2/P17
67.SSR TKNE FM HK1 BKKPVG 856 V26JUN 7744132436879/2/P18
68.SSR TKNE FM HK1 BKKPVG 856 V26JUN 7744132436880/2/P19
69.SSR TKNE FM HK1 BKKPVG 856 V26JUN 7744132436881/2/P20
70.SSR DOCS   
71.SSR DOCS   
72.SSR DOCS   
73.SSR DOCS                                                                    
74.SSR DOCS                                                                    
75.SSR DOCS   
76.SSR DOCS   
77.SSR DOCS   
78.SSR DOCS   
79.SSR DOCS   
80.SSR DOCS   
81.SSR DOCS   
82.SSR DOCS   
83.SSR DOCS   
84.SSR DOCS   
85.SSR DOCS                                                                    
86.SSR DOCS                                                                    
87.SSR DOCS   
88.SSR DOCS   
89.SSR DOCS   
90.SSR CHLD FM HK1 06OCT08/P16  
91.SSR CHLD FM HK1 19OCT07/P14  
92.SSR CHLD FM HK1 06FEB08/P9   
93.OSI YY CTCT64730202 1381650808   
94.RMK TJ SHA255
95.RMK CA/MLB950
96.RMK CLAIM PNR ACK RECEIVED   
97.RMK TJ AUTH SHA255                                                          
98.RMK TJ AUTH SHA874                                                          
99.FN/FCNY2650.00/SCNY1710.00/C5.00/XCNY1186.00/TCNY90.00CN/TCNY146.00TS/   
    TCNY950.00YQ/ACNY3836.00
100.FN/FCNY1990.00/SCNY1710.00/C5.00/XCNY1096.00/TEXEMPTCN/TCNY146.00TS/
    TCNY950.00YQ/ACNY3086.00/P9/14/16   
101.TN/774-4132436862/P1
102.TN/774-4132436863/P2
103.TN/774-4132436864/P3
104.TN/774-4132436865/P4
105.TN/774-4132436866/P5
106.TN/774-4132436867/P6
107.TN/774-4132436868/P7                                                       
108.TN/774-4132436869/P8                                                       
109.TN/774-4132436870/P9
110.TN/774-4132436871/P10   
111.TN/774-4132436872/P11   
112.TN/774-4132436873/P12   
113.TN/774-4132436874/P13   
114.TN/774-4132436875/P14   
115.TN/774-4132436876/P15   
116.TN/774-4132436877/P16   
117.TN/774-4132436878/P17   
118.TN/774-4132436879/P18   
119.TN/774-4132436880/P19                                                      
120.TN/774-4132436881/P20                                                      
121.FP/CASH,CNY 
122.SHA325'''


		] as String []

		return  testCase.collect { [it] as Object[] }
	}

	TestExtrTkt(a) {
		param = a
	}



	@Test void positivesFixed() {

		RtInterceptorBean  rtInterceptorBean = new RtInterceptorBean();
		rtInterceptorBean. rtParserAfterHandlerList.add(new TicketExtractorHandler());

		String pnrContent = EtermWebClient.cutRtContent(param)
		
		RtInfoBean rtInfoBean = new RtInfoBean();
		
		rtInfoBean.rt = pnrContent
		

		parser.parseRT(rtInfoBean ,, rtInterceptorBean);



		StringWriter writer = new StringWriter();
		xstream.marshal(parser.pnrRet, new PrettyPrintWriter(writer, new NoNameCoder()));

		String xml = writer.toString();
		println xml +"\n\n\n"


	}

}