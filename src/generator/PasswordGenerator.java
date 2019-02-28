package generator;

public class PasswordGenerator {

    public static final int UP_REGISTER = 1;
    public static final int DOWN_REGISTER = 2;
    public static final int ALL_REGISTER = 3;

    private int length;


    public static String generatePass(String urlSource, int typeOfRegister){

        switch (typeOfRegister){
            case UP_REGISTER:
                PageDownloader pageDownloader = new PageDownloader();
                pageDownloader.htmlCodeDownload(urlSource);

                break;
            case DOWN_REGISTER:
                break;
            case ALL_REGISTER:
                break;
        }
    }
}
