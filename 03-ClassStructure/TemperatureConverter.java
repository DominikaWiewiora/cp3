public class TemperatureConverter {

    public static float CelsiusToKelvin(float celsius) {
        return celsius + 273.15f;
    }

    public static float KelvinToCelsius(float kelvin) {
        return kelvin - 273.15f;
    }

    // °F = (K − 273.15) × 1.8 + 32 

    //K = (F − 32) × 5 ⁄ 9 + 273.15
    //C = 5/9(F-32)
    //°F = (9/5) °C+32

    public static float KelvinToFahrenheit(float kelvin) {
        return (kelvin - 273.15f)* 1.8f +32;
    }

    public static float FahrenheitToKelvin(float fahrenheit) {
        return (fahrenheit - 32)*5/9+273.15f;
    }

    public static float ClesiusToFahrenheit(float celsius) {
        return (9.0f/5.0f)*celsius+32.0f;
    }

    public static float FahrenheitToCelsius(float fahrenheit) {
        return 5.0f/9.0f*(fahrenheit-32.0f);
    }

    public static void main(String[] args) {
        System.out.println("25 degrees Celsius= "+TemperatureConverter.CelsiusToKelvin(25)+ " Kelvin = "+TemperatureConverter.ClesiusToFahrenheit(25)+" Fahrenheit");
        System.out.println("100 degrees Fahrenheit= "+TemperatureConverter.FahrenheitToKelvin(100)+ " Kelvin = "+TemperatureConverter.FahrenheitToCelsius(100)+" Celsius");
        System.out.println("0 degrees Kelvin= "+TemperatureConverter.KelvinToCelsius(0)+ " Celsius = "+TemperatureConverter.KelvinToFahrenheit(0)+" Fahrenheit");
}
        
    }
    

   
    
