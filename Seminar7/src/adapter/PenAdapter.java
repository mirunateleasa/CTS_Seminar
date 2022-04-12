package adapter;

public class PenAdapter implements Pen {
	PilotPen pilotPen = new PilotPen();

	@Override
	public void delete() {
		pilotPen.delete();
	}

}
