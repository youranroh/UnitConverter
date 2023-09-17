public class Conversions{
    private double convertMeter(double f, String to) {
        switch (to) {
            case "meter":
                // no change
                return f;

            case "centimeter":
                return (f * 100);

            case "millimeter":
                return (f * 1000);

            case "kilometer":
                return (f / 1000);

            case "inch":
                return (f * 39.36);

            case "feet":
                return (f * 3.28084);

            case "yard":
                return (f * 1.09361);

            case "mile":
                return (f * 0.000621371);
            
            default:
                break;
        }
        return 0;
    }

    protected double lengthConverter(double f, String from, String to) {
        double holder;
        switch (from) {
            case "meter":
                return convertMeter(f, to);

            case "centimeter":
                // first convert to meter
                holder = (f / 100);
                // then convert to the desired unit.
                return convertMeter(holder, to);

            case "millimeter":
                // first convert to meter
                holder = (f / 1000);
                // then convert to the desired unit.
                return convertMeter(holder, to);

            case "kilometer":
                // first convert to meter
                holder = (f * 100);
                // then convert to the desired unit.
                return convertMeter(holder, to);

            case "inch":
                // first convert to meter
                holder = (f * 0.0254);
                // then convert to the desired unit.
                return convertMeter(holder, to);

            case "feet":
                // first convert to meter
                holder = (f * 0.3048);
                // then convert to the desired unit.
                return convertMeter(holder, to);

            case "yard":
                // first convert to meter
                holder = (f * 0.9144);
                // then convert to the desired unit.
                return convertMeter(holder, to);

            case "mile":
                // first convert to meter
                holder = (f * 1609.34);
                // then convert to the desired unit.
                return convertMeter(holder, to);

            default:
                break;
        }
        return 0;
    }// length converter

    private double convertSecond(double f, String to) {
        switch (to) {
            case "second":
                // no change
                return f;

            case "minute":
                return (f / 60);

            case "hour":
                return (f / 3600);

            case "day":
                return (f / 86400);

            case "week":
                return (f / 604800);

            case "month":
                return (f / 2628000);

            case "year":
                return (f / 31536000);

            default:
                break;
        }
        return 0;
    }// convert seconds

    protected double timeConverter(double f, String from, String to) {
        double holder;
        switch (from) {
            case "second":
                return convertSecond(f, to);

            case "minute":
                // first convert to seconds
                holder = (f * 60);
                // then convert to the desired unit.
                return convertSecond(holder, to);

            case "hour":
                // first convert to seconds
                holder = (f * 3600);
                // then convert to the desired unit.
                return convertSecond(holder, to);

            case "day":
                // first convert to seconds
                holder = (f * 86400);
                // then convert to the desired unit.
                return convertSecond(holder, to);

            case "week":
                // first convert to seconds
                holder = (f * 604800);
                // then convert to the desired unit.
                return convertSecond(holder, to);

            case "month":
                // first convert to seconds
                holder = (f * 628000);
                // then convert to the desired unit.
                return convertSecond(holder, to);

            case "year":
                // first convert to seconds
                holder = (f * 31536000);
                // then convert to the desired unit.
                return convertSecond(holder, to);

            default:
                break;

        } // switch
        return 0;
    }// time converter

    private double convertCelcius(double f, String to) {
        switch (to) {
            case "celcius":
                // no change
                return f;

            case "farenheit":
                return ((f * 1.8) + 32);

            case "Kelvin":
                return (f + 273.15);

            default:
                break;
        }// switch
        return 0;
    }// convert celcius

    protected double tempConverter(double f, String from, String to) {
        double holder;
        switch (from) {
            case "celcius":
                return convertCelcius(f, to);

            case "farenheit":
                // first convert to celcius
                holder = ((f - 32) * (5.0 / 9.0));
                //System.out.println(f);
                //System.out.println(holder);
                // then convert to the desired unit.
                return convertCelcius(holder, to);

            case "Kelvin":
                // first convert to celcius
                holder = (f - 273.15);
                // then convert to the desired unit.
                return convertCelcius(holder, to);

            default:
                break;
        }// switch
        return 0;
    }// temperature converter

    private double convertGram(double f, String to) {
        switch (to) {
            case "gram":
                // no change
                return f;

            case "milligram":
                return (f * 1000);

            case "kilogram":
                return (f / 1000);

            case "pound":
                return (f * 0.00220462);

            case "ton":
                return (f / 907184.000009408);
            
            default:
                break;

        }// switch
        return 0;
    }// convert grams

    protected double massConverter(double f, String from, String to) {
        double holder;
        switch (from) {
            case "gram":
                return convertGram(f, to);

            case "milligram":
                // first convert to gram
                holder = (f / 1000);
                // then convert to the desired unit.
                return convertGram(holder, to);

            case "kilogram":
                // first convert to gram
                holder = (f * 1000);
                // then convert to the desired unit.
                return convertGram(holder, to);

            case "pound":
                // first convert to gram
                holder = (f * 453.592);
                // then convert to the desired unit.
                return convertGram(holder, to);

            case "ton":
                // first convert to gram
                holder = (f * 907184.74);
                // then convert to the desired unit.
                return convertGram(holder, to);

            default:
                break;
        }
        return 0;
    }// mass converter

    private double convertLiter(double f, String to) {
        switch (to) {
            case "liter":
                // no change
                return f;

            case "milliliter":
                return (f * 1000);

            case "teaspoon":
                return (f * 202.884);

            case "tablespoon":
                return (f * 67.6279201497831);

            case "cup":
                return (f * 4.22675);

            case "pint":
                return (f * 2.11337499994426);

            case "fluid ounce":
                return (f * 33.814);

            case "gallon":
                return (f * 0.264172);

            case "quart":
                return (f * 1.05669);

            default:
                break;
        }
        return 0;
    }// convert liters

    protected double volumeConverter(double f, String from, String to) {
        double holder;
        switch (from) {
            case "liter":
                return convertLiter(f, to);

            case "milliliter":
                // first convert to liter
                holder = (f / 1000);
                // then convert to the desired unit.
                return convertLiter(holder, to);

            case "teaspoon":
                // first convert to liter
                holder = (f * 0.00492892);
                // then convert to the desired unit.
                return convertLiter(holder, to);

            case "tablespoon":
                // first convert to liter
                holder = (f * 0.0147868);
                // then convert to the desired unit.
                return convertLiter(holder, to);

            case "cup":
                // first convert to liter
                holder = (f * 0.236588);
                // then convert to the desired unit.
                return convertLiter(holder, to);

            case "pint":
                // first convert to liter
                holder = (f * 0.568261);
                // then convert to the desired unit.
                return convertLiter(holder, to);

            case "fluid ounce":
                // first convert to liter
                holder = (f * 0.0295735);
                // then convert to the desired unit.
                return convertLiter(holder, to);

            case "gallon":
                // first convert to liter
                holder = (f * 3.78541);
                // then convert to the desired unit.
                return convertLiter(holder, to);

            case "quart":
                // first convert to liter
                holder = (f * 0.946353);
                // then convert to the desired unit.
                return convertLiter(holder, to);

            default:
                break;
        }
        return 0;
    }// volume converter
}