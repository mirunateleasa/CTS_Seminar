package solid.i.wrong.printers;

import solid.i.wrong.iPrintTask;

public class HPModelZ implements iPrintTask{

	@Override
	public boolean printContent(String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scanContent(String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean faxContent(String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean printContentExternalDevice(String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean authBadge(String content) {
		// TODO Auto-generated method stub
		return false;
	}
	//this class is forced to implement all the methods of iPrintTask even if it doesn't need it all => Interface Segregation
}
