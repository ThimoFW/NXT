import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;

public class UltraSonicSensor {

	public static void main(String[] args) {
		UltrasonicSensor us1 = new UltrasonicSensor(SensorPort.S2);
		//long startTime = 0; long endTime = 0; int pingTime = 0;
		LCD.drawString("UltraSonic test", 0, 0);
		int distance = 0;
		while (Button.ESCAPE.isUp()) {
			us1.ping();
			distance = us1.getDistance();
			LCD.clear(1);
			LCD.drawInt(distance, 1, 1); 
			LCD.drawString(" cm", 4, 1);
		}

	}

}
