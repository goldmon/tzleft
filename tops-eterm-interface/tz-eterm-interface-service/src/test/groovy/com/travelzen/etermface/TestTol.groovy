package com.travelzen.etermface

import com.travelzen.etermface.service.ticket.tol.TolParser;
import com.travelzen.etermface.service.ticket.tol.TolSyntaxTree
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import com.travelzen.etermface.service.ticket.tol.TolLexer

/**
 * @author liang.wang
 *
 */
class TestTol {

	private static Logger logger = LoggerFactory.getLogger(TestTol.class)

	static main(args) {

		def  tolCont =
		''' *********************************************************************************                       TICKET STORE/USE  REPORT                               **   AGENT  :   43658                             AIRLINE : BSP                 **   OFFICE :  SHA255                             IATA NO.: 08307736            **   DATE   : 18NOV13                             TIME   : 14:52                *--------------------------------------------------------------------------------        Form First     Last        Granted  Granted By  Granted  Ticket Allo
 Office Code TKT no.    TKT    Qua  By OFF   Agent/Pid    Date   T/Tp/M Tp/ST   -------------------------------------------------------------------------------  System       Ticket Range     Qua  Start/End Date  Office   Agent/Pid  Dev Use -------------------------------------------------------------------------------  SHA255  438-6438351-6440350   2000 BJS636    9940/  711 04NOV13 I/DC/E TK/UO  
CRS      6438351-6438360     10 05NOV13/05NOV13   SHA255 43728/33289  32 TK
    CRS      6438361-6438410     50 05NOV13/06NOV13   SHA255 43738/60714  16 TK     CRS      6438411-6438430     20 05NOV13/06NOV13   SHA255 43755/60718  33 TK     CRS      6438431-6438460     30 05NOV13/07NOV13   SHA255 43680/39387   3 TK     CRS      6438461-6438470     10 05NOV13/06NOV13   SHA255 43728/33289  32 TK     CRS      6438471-6438970    500 05NOV13/05NOV13   SHA255 43756/16085  25 TK     CRS      6438971-6439470    500 05NOV13/06NOV13   SHA255 43756/70214  70 TK     CRS      6439471-6439570    100 05NOV13/12NOV13   SHA255 19842/63879  71 TK     CRS      6439571-6439580     10 05NOV13/11NOV13   SHA255 43749/24924   9 TK     CRS      6439581-6439600     20 05NOV13/12NOV13   SHA255 43706/14386  69 TK     CRS      6439601-6439606      6 05NOV13/06NOV13   SHA255 43744/60692  13 TK     CRS      6439607-6439616     10 05NOV13/06NOV13   SHA255 43662/33291  20 TK
CRS      6439617-6440116    500 06NOV13/06NOV13   SHA255 43756/16085  25 TK
    CRS      6440117-6440126     10 06NOV13/14NOV13   SHA255 43736/86319  29 TK     CRS      6440127-6440156     30 06NOV13/08NOV13   SHA255 43735/39392  28 TK     CRS      6440157-6440350    194 06NOV13/06NOV13   SHA255 43756/16085  25 TK          439-8263250-8266249   3000 BJS636    9940/  711 04NOV13 D/DC/E TK/UO       CRS      8263250-8263749    500 04NOV13/04NOV13   SHA255 43756/16130  64 TK     CRS      8263750-8264249    500 04NOV13/05NOV13   SHA255 43756/16085  43 TK     CRS      8264250-8264749    500 04NOV13/04NOV13   SHA255 43756/70328  67 TK     CRS      8264750-8265249    500 04NOV13/05NOV13   SHA255 43756/16135   7 TK     CRS      8265250-8265749    500 04NOV13/04NOV13   SHA255 43756/16130  64 TK     CRS      8265750-8266249    500 04NOV13/04NOV13   SHA255 43756/16130  64 TK          438-6496951-6498450   1500 BJS636    9940/  711 05NOV13 I/DC/E TK/UO  
CRS      6496951-6497000     50 06NOV13/07NOV13   SHA255 43738/60698  16 TK
    CRS      6497001-6497030     30 06NOV13/07NOV13   SHA255 43755/39419  33 TK     CRS      6497031-6497530    500 06NOV13/06NOV13   SHA255 43756/16085  25 TK     CRS      6497531-6497540     10 06NOV13/07NOV13   SHA255 43728/39406  32 TK     CRS      6497541-6497570     30 06NOV13/12NOV13   SHA255 43704/39384  21 TK     CRS      6497571-6497670    100 06NOV13/07NOV13   SHA255 43686/95320  10 TK     CRS      6497671-6497700     30 06NOV13/07NOV13   SHA255 43752/24926  73 TK     CRS      6497701-6498200    500 06NOV13/07NOV13   SHA255 43756/16085  25 TK     CRS      6498201-6498230     30 07NOV13/08NOV13   SHA255 43680/39387   3 TK     CRS      6498231-6498450    220 07NOV13/07NOV13   SHA255 43756/70214  70 TK          439-8441140-8443139   2000 BJS636    9940/  711 05NOV13 D/DC/E TK/UO       CRS      8441140-8441639    500 05NOV13/05NOV13   SHA255 43756/16130  64 TK
CRS      8441640-8442139    500 05NOV13/06NOV13   SHA255 43756/16135   7 TK
    CRS      8442140-8442229     90 05NOV13/07NOV13   SHA255 43687/41649  52 TK     CRS      8442640-8443139    500 05NOV13/07NOV13   SHA255 43756/70328  67 TK     CRS      8442230-8442439    210 07NOV13/10NOV13   SHA255 43747/41641  52 TK     CRS      8442440-8442639    200 07NOV13/07NOV13   SHA255 43756/16085  43 TK          438-6522971-6524470   1500 BJS636    9940/  711 06NOV13 I/DC/E TK/IU       CRS      6522971-6522980     10 07NOV13/          SHA255 43756/70214  26
    CRS      6522981-6523480    500 07NOV13/07NOV13   SHA255 43756/16085  25 TK     CRS      6523481-6523980    500 07NOV13/08NOV13   SHA255 43756/70214  70 TK     CRS      6523981-6524000     20 07NOV13/          SHA255 19840/83059  20
    CRS      6524001-6524050     50 07NOV13/08NOV13   SHA255 43738/60698  16 TK     CRS      6524051-6524150    100 07NOV13/10NOV13   SHA255 43686/95320  10 TK
CRS      6524151-6524180     30 07NOV13/11NOV13   SHA255 43746/24925  48 TK
    CRS      6524181-6524200     20 07NOV13/08NOV13   SHA255 43718/63869   5 TK     CRS      6524201-6524230     30 07NOV13/08NOV13   SHA255 43752/24926  73 TK     CRS      6524231-6524245     15 07NOV13/08NOV13   SHA255 43728/39406  32 TK     CRS      6524246-6524470    225 07NOV13/07NOV13   SHA255 43756/16085  25 TK          439-8586310-8587509   1200 BJS636    9940/  711 06NOV13 D/DC/E TK/UO       CRS      8586310-8586809    500 06NOV13/07NOV13   SHA255 43740/83060  43 TK     CRS      8586810-8587309    500 06NOV13/07NOV13   SHA255 43756/16135   7 TK     CRS      8587310-8587509    200 06NOV13/06NOV13   SHA255 43756/16130  64 TK          438-6614351-6617350   3000 BJS636    9940/  711 07NOV13 I/DC/E TK/UO       CRS      6614351-6614370     20 07NOV13/11NOV13   SHA255 43744/24687  13 TK     CRS      6614371-6614387     17 07NOV13/12NOV13   SHA255 43737/39400  30 TK
CRS      6614388-6614408     21 07NOV13/08NOV13   SHA255 43755/39419  33 TK
    CRS      6614409-6614908    500 08NOV13/08NOV13   SHA255 43756/16085  25 TK     CRS      6614909-6614928     20 08NOV13/09NOV13   SHA255 43755/39419  33 TK     CRS      6614929-6615428    500 08NOV13/08NOV13   SHA255 43756/16085  25 TK     CRS      6615429-6615458     30 08NOV13/11NOV13   SHA255 43752/24926  73 TK     CRS      6615459-6615478     20 08NOV13/11NOV13   SHA255 43718/44166   5 TK     CRS      6615479-6615528     50 08NOV13/11NOV13   SHA255 43738/60698  16 TK     CRS      6615529-6615548     20 08NOV13/11NOV13   SHA255 43728/39406  32 TK     CRS      6615549-6615568     20 08NOV13/11NOV13   SHA255 43735/39392  28 TK     CRS      6615569-6616068    500 08NOV13/11NOV13   SHA255 43756/70214  70 TK     CRS      6616069-6616118     50 08NOV13/16NOV13   SHA255 43757/44164  47 TK     CRS      6616119-6616138     20 08NOV13/15NOV13   SHA255 43715/39385  22 TK
CRS      6616139-6616638    500 08NOV13/09NOV13   SHA255 43756/16085  25 TK
    CRS      6616639-6616641      3 09NOV13/14NOV13   SHA255 43688/46502  36 TK     CRS      6616659-6617158    500 10NOV13/11NOV13   SHA255 43756/16085  25 TK     CRS      6617159-6617188     30 10NOV13/11NOV13   SHA255 43686/95320  10 TK     CRS      6617189-6617208     20 11NOV13/13NOV13   SHA255 43680/39387   3 TK     CRS      6617209-6617218     10 11NOV13/11NOV13   SHA255 43755/39419  33 TK     CRS      6617219-6617350    132 11NOV13/11NOV13   SHA255 43756/16085  25 TK     CRS      6616642-6616658     17 14NOV13/16NOV13   SHA255 43747/41641  36 TK          460-0019900-0022899   3000 BJS636    9940/  711 07NOV13 D/DC/E TK/UO       CRS      0019900-0020226    327 07NOV13/10NOV13   SHA255 43687/41649  14 TK     CRS      0020400-0020899    500 07NOV13/08NOV13   SHA255 43756/16130  64 TK     CRS      0020900-0021399    500 07NOV13/08NOV13   SHA255 43756/70328  67 TK
CRS      0021900-0022399    500 07NOV13/09NOV13   SHA255 43756/16130  39 TK
    CRS      0022400-0022899    500 07NOV13/08NOV13   SHA255 43756/16135   7 TK     CRS      0021400-0021899    500 07NOV13/09NOV13   SHA255 43756/16085  43 TK     CRS      0020227-0020298     72 10NOV13/11NOV13   SHA255 43687/41643  52 TK     CRS      0020299-0020399    101 10NOV13/12NOV13   SHA255 43688/46502  14 TK          438-6680891-6682990   2100 BJS636    9940/  711 08NOV13 I/DC/E TK/IU       CRS      6680891-6681390    500 11NOV13/12NOV13   SHA255 43756/70214  70 TK     CRS      6681391-6681440     50 11NOV13/12NOV13   SHA255 43738/60698  16 TK     CRS      6681441-6681450     10 11NOV13/11NOV13   SHA255 43749/24924   9 TK     CRS      6681451-6681500     50 11NOV13/12NOV13   SHA255 43752/24926  73 TK     CRS      6681501-6682000    500 11NOV13/11NOV13   SHA255 43756/16085  25 TK     CRS      6682001-6682020     20 11NOV13/12NOV13   SHA255 43735/39392  28 TK
CRS      6682021-6682040     20 11NOV13/13NOV13   SHA255 43755/39419  33 TK
    CRS      6682041-6682060     20 11NOV13/12NOV13   SHA255 43744/24687  13 TK     CRS      6682061-6682160    100 11NOV13/13NOV13   SHA255 43686/95320  10 TK     CRS      6682161-6682660    500 11NOV13/12NOV13   SHA255 43756/16085  25 TK     CRS      6682661-6682680     20 11NOV13/14NOV13   SHA255 43746/24925  48 TK     CRS      6682681-6682700     20 11NOV13/12NOV13   SHA255 43718/44166   5 TK     CRS      6682701-6682710     10 12NOV13/14NOV13   SHA255 43728/39406  32 TK     CRS      6682711-6682740     30 12NOV13/13NOV13   SHA255 43735/39392  28 TK     CRS      6682741-6682840    100 12NOV13/          SHA255 43703/13539  71
    CRS      6682841-6682850     10 12NOV13/14NOV13   SHA255 43737/39400  30 TK     CRS      6682851-6682990    140 12NOV13/12NOV13   SHA255 43756/16085  25 TK          460-0333820-0336319   2500 BJS636    9940/  711 08NOV13 D/DC/E TK/UO  
CRS      0333820-0334319    500 08NOV13/11NOV13   SHA255 43756/16130  64 TK
    CRS      0334320-0334819    500 08NOV13/11NOV13   SHA255 43756/70328  67 TK     CRS      0334820-0335319    500 08NOV13/10NOV13   SHA255 43756/16135   7 TK     CRS      0335320-0335819    500 09NOV13/09NOV13   SHA255 43756/16130  39 TK     CRS      0335820-0336319    500 09NOV13/11NOV13   SHA255 43756/16085  43 TK          438-6719011-6721510   2500 BJS636    9940/  711 11NOV13 I/DC/E TK/IU       CRS      6719011-6719510    500 12NOV13/12NOV13   SHA255 43756/16085  25 TK     CRS      6719511-6719540     30 12NOV13/          SHA255 43703/13539  21
    CRS      6719541-6720040    500 12NOV13/13NOV13   SHA255 43756/70214  70 TK     CRS      6720041-6720060     20 12NOV13/13NOV13   SHA255 43744/24687  13 TK     CRS      6720061-6720110     50 12NOV13/13NOV13   SHA255 43738/60698  16 TK     CRS      6720111-6720210    100 12NOV13/          SHA255 43703/13539  12   
CRS      6720211-6720230     20 12NOV13/14NOV13   SHA255 43718/44166   5 TK
    CRS      6720231-6720240     10 12NOV13/15NOV13   SHA255 43706/60714  69 TK     CRS      6720241-6720270     30 12NOV13/14NOV13   SHA255 43752/24926  73 TK     CRS      6720271-6720770    500 13NOV13/13NOV13   SHA255 43756/16085  25 TK     CRS      6720771-6720800     30 13NOV13/15NOV13   SHA255 43755/39419  33 TK     CRS      6720801-6720810     10 13NOV13/13NOV13   SHA255 43749/24924   9 TK     CRS      6720811-6720820     10 13NOV13/18NOV13   SHA255 43749/24924   9 TK     CRS      6720821-6721320    500 13NOV13/13NOV13   SHA255 43756/16085  25 TK     CRS      6721321-6721370     50 13NOV13/14NOV13   SHA255 43738/60698  16 TK     CRS      6721371-6721400     30 13NOV13/18NOV13   SHA255 43735/39392  28 TK     CRS      6721401-6721510    110 13NOV13/13NOV13   SHA255 43756/70214  70 TK          460-0766070-0768569   2500 BJS636    9940/  711 11NOV13 D/DC/E TK/UO  
CRS      0766070-0766569    500 11NOV13/13NOV13   SHA255 43756/70328  67 TK
    CRS      0766570-0767069    500 11NOV13/12NOV13   SHA255 43756/16135   7 TK     CRS      0767570-0768069    500 11NOV13/12NOV13   SHA255 43756/16085  43 TK     CRS      0768070-0768569    500 11NOV13/13NOV13   SHA255 43756/16130  64 TK     CRS      0767070-0767072      3 12NOV13/12NOV13   SHA255 43687/41643  52 TK     CRS      0767073-0767272    200 12NOV13/14NOV13   SHA255 43751/95291  14 TK     CRS      0767273-0767569    297 12NOV13/16NOV13   SHA255 43747/41641  52 TK          438-6840891-6842190   1300 BJS636    9940/  711 12NOV13 I/DC/E TK/IU       CRS      6840891-6840920     30 13NOV13/15NOV13   SHA255 43680/39387   3 TK     CRS      6840921-6840940     20 13NOV13/15NOV13   SHA255 43744/24687  13 TK     CRS      6840941-6841440    500 13NOV13/14NOV13   SHA255 43756/70214  70 TK     CRS      6841441-6841940    500 13NOV13/14NOV13   SHA255 43756/16085  25 TK
CRS      6841941-6842040    100 13NOV13/15NOV13   SHA255 43686/95320  10 TK
    CRS      6842041-6842060     20 14NOV13/18NOV13   SHA255 43737/39400  30 TK     CRS      6842061-6842190    130 14NOV13/14NOV13   SHA255 43756/16085  25 TK          460-1203540-1205039   1500 BJS636    9940/  711 12NOV13 D/DC/E TK/IU       CRS      1203540-1204039    500 12NOV13/13NOV13   SHA255 43756/16135   7 TK     CRS      1204540-1205039    500 12NOV13/13NOV13   SHA255 43756/16085  43 TK     CRS      1204040-1204539    500 14NOV13/          SHA255 43688/46502  14
         438-6868651-6870350   1700 BJS636    9940/  711 13NOV13 I/DC/E TK/IU       CRS      6868651-6868670     20 14NOV13/15NOV13   SHA255 43728/39406  32 TK     CRS      6868671-6869170    500 14NOV13/15NOV13   SHA255 43756/16085  25 TK     CRS      6869171-6869220     50 14NOV13/18NOV13   SHA255 43752/24926  73 TK     CRS      6869221-6869250     30 14NOV13/16NOV13   SHA255 43746/24925  48 TK
CRS      6869251-6869750    500 14NOV13/15NOV13   SHA255 43756/70214  70 TK
    CRS      6869751-6869800     50 14NOV13/15NOV13   SHA255 43738/60698  16 TK     CRS      6869801-6869820     20 14NOV13/          SHA255 43703/13539   5
    CRS      6869821-6870320    500 15NOV13/15NOV13   SHA255 43756/16085  25 TK     CRS      6870321-6870330     10 15NOV13/          SHA255 43756/70262  29
    CRS      6870331-6870331      1 15NOV13/15NOV13   SHA255 43706/60714  69 TK     CRS      6870332-6870350     19 15NOV13/18NOV13   SHA255 43680/39387   3 TK          460-1334370-1336369   2000 BJS636    9940/  711 13NOV13 D/DC/E TK/UO       CRS      1334370-1334869    500 13NOV13/14NOV13   SHA255 43756/16135   7 TK     CRS      1334870-1335369    500 13NOV13/14NOV13   SHA255 43756/16130  64 TK     CRS      1335370-1335869    500 13NOV13/14NOV13   SHA255 43756/70328  67 TK     CRS      1335870-1336369    500 13NOV13/16NOV13   SHA255 43756/16085  43 TK
419-2044643-2046642   2000 BJS636    9940/  711 14NOV13 D/DC/E TK/UO  
    CRS      2044643-2045142    500 14NOV13/16NOV13   SHA255 43756/16130  64 TK     CRS      2045143-2045642    500 14NOV13/15NOV13   SHA255 43756/70328  67 TK     CRS      2045643-2046142    500 14NOV13/15NOV13   SHA255 43756/16135   7 TK     CRS      2046143-2046642    500 15NOV13/15NOV13   SHA255 43756/70328  67 TK          438-6902221-6904720   2500 BJS636    9940/  711 14NOV13 I/DC/E TK/IU       CRS      6902221-6902235     15 15NOV13/16NOV13   SHA255 43715/39385  22 TK     CRS      6902236-6902735    500 15NOV13/15NOV13   SHA255 43756/16085  25 TK     CRS      6902736-6902765     30 15NOV13/          SHA255 43703/13539  33
    CRS      6902766-6902785     20 15NOV13/          SHA255 43703/13539  69
    CRS      6902786-6902805     20 15NOV13/          SHA255 43703/13539  13
    CRS      6902806-6902855     50 15NOV13/17NOV13   SHA255 43738/60698  16 TK
CRS      6902856-6902875     20 15NOV13/          SHA255 43703/13539  32   
    CRS      6902876-6902975    100 15NOV13/          SHA255 43703/13539  10
    CRS      6902976-6903475    500 15NOV13/16NOV13   SHA255 43756/16085  25 TK     CRS      6903476-6903975    500 15NOV13/          SHA255 43756/70214  70
    CRS      6903976-6903995     20 16NOV13/          SHA255 43687/41643  36
    CRS      6903996-6904025     30 16NOV13/          SHA255 43756/16174  47
    CRS      6904026-6904525    500 16NOV13/18NOV13   SHA255 43756/16085  25 TK     CRS      6904526-6904575     50 17NOV13/18NOV13   SHA255 43738/60698  16 TK     CRS      6904576-6904720    145 18NOV13/18NOV13   SHA255 43756/16085  25 TK          419-2517833-2521332   3500 BJS636    9940/  711 15NOV13 D/DC/E TK/IU       CRS      2517833-2518332    500 15NOV13/18NOV13   SHA255 43756/16135   7 TK     CRS      2518333-2518832    500 15NOV13/18NOV13   SHA255 43756/16130  39 TK
CRS      2518833-2519332    500 15NOV13/16NOV13   SHA255 43756/70328  67 TK
    CRS      2519333-2519832    500 16NOV13/18NOV13   SHA255 43756/16085  43 TK     CRS      2519833-2520332    500 16NOV13/          SHA255 43687/41643  52
    CRS      2520333-2520832    500 17NOV13/          SHA255 43756/70328  67
    CRS      2520833-2521332    500 18NOV13/          SHA255 43756/16130  64
         438-7035261-7037760   2500 BJS636    9940/  711 15NOV13 I/DC/E TK/IU       CRS      7035261-7035270     10 18NOV13/          SHA255 43703/13539  15
    CRS      7035271-7035300     30 18NOV13/          SHA255 43703/13539  48
    CRS      7035301-7035330     30 18NOV13/          SHA255 43703/13539  28
    CRS      7035331-7035830    500 18NOV13/          SHA255 43756/16085  25
    CRS      7035831-7035880     50 18NOV13/          SHA255 43703/13539  73
    CRS      7035881-7035885      5 18NOV13/          SHA255 43703/13539  22   
CRS      7035886-7035887      2 18NOV13/18NOV13   SHA255 43749/24924   9 TK
 SHA255  END  
*=============================================================================* TOTAL TICKETS :      43800   TOTAL IN USE:      43800   TOTAL STORE:          0 *
'''

		TolLexer lexer = new TolLexer( tolCont.split("(\r|\n)+") )
		TolParser parser = new TolParser(lexer);

		TolSyntaxTree  syntaxTree = parser.parse();
		
		println (syntaxTree) 



		//		TolParser parser = new TolParser()
		//		TolConfig tolConfig = new TolConfig(3)
		//
		//		TolResult res = parser.parseTol(tolCont).getObject()
		//		logger.info(res.toString())
	}
}
