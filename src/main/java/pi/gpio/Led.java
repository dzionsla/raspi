package pi.gpio;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigital;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class Led {
	public Led() throws InterruptedException {
		System.out.println("start GPIO example ....");
		
		final GpioController gpio = GpioFactory.getInstance();
		
		final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "MyLed", PinState.HIGH);
		
		pin.setShutdownOptions(true, PinState.LOW);
		
		System.out.println("GPIO state ON");
		
		Thread.sleep(3000);
		
		pin.low();
		
		System.out.println("GPIO state OFF");
		
		Thread.sleep(3000);
		
		pin.toggle();
		
		System.out.println("GPIO state ON");
		
		Thread.sleep(3000);
		
		
		gpio.shutdown();
		
		System.out.println("Shutdown GPIO");
	}
	
	
}
