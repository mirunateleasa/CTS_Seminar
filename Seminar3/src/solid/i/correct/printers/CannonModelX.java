package solid.i.correct.printers;

import solid.i.correct.iAuthenticationTask;
import solid.i.correct.iFaxTask;
import solid.i.correct.iPrintExternalDeviceTask;
import solid.i.correct.iPrintTask;
import solid.i.correct.iScanTask;

public class CannonModelX implements iPrintTask, iScanTask, iFaxTask, iPrintExternalDeviceTask, iAuthenticationTask{

	@Override
	public boolean authBadge(String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean printContentExternalDevice(String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean faxContent(String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scanContent(String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean printContent(String content) {
		// TODO Auto-generated method stub
		return false;
	}

}
