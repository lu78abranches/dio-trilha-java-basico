public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? : " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual :" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv ligada? : " + smartTv.ligada);

        smartTv.desligada();

        System.out.println("Tv ligada? : " + smartTv.ligada);

        smartTv.mudarCanalAcima();

        System.out.println("Canal atual : " + smartTv.canal);

        smartTv.mudarCanalAbaixo();

        System.out.println("Canal atual : " + smartTv.canal);

        smartTv.mudarCanal(89);

        System.out.println("Canal atual : " + smartTv.canal);

        smartTv.aumentarVolume();

        System.out.println("Volume atual :" + smartTv.volume);

        smartTv.diminuirVolume();

        System.out.println("Volume atual :" + smartTv.volume);

    }
}
