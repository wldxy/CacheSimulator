

public class MonitorBtoF {
	int CPUid;
	int BlockNum;
	int BlockStatus;//I = 1; S = 2; M = 3;
	int BlockStoNum = -1;
	int StCStorageNum = -1;
	int CtSStorageNum = -1;
	int BusWireStatus = 0;//RdMiss = 1; WtMiss = 2; Read = 3; Write = 4; Invalidate = 5
	
	MonitorBtoF(int id, int bnum, int bsta, int bstonum, int stcstonum, int ctsstonum, int bws) {
		CPUid = id;
		BlockNum = bnum;
		BlockStatus = bsta;
		BlockStoNum = bstonum;
		
		StCStorageNum = stcstonum;
		CtSStorageNum = ctsstonum;
		
		BusWireStatus = bws;
	}
}

