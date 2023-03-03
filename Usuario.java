public class Usuario {
    public static void main(String args[]) throws Exception {

        SmartTV smartTV = new SmartTV();

        smartTV.aumentarVolume();
        System.out.println(smartTV.volume);
        
        smartTV.diminuirVolume();
        System.out.println(smartTV.volume);
        
        smartTV.mudarCanal(12);

        System.out.println("TV ligada ?" + smartTV.ligada);
        System.out.println("Canal Atual:" + smartTV.canal);
        System.out.println("Volume: " + smartTV.volume);

        smartTV.ligar();
        System.out.println(smartTV.ligada);

        smartTV.desligar();
        System.out.println(smartTV.ligada);

    }
