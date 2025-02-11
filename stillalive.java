package still_alive;
import still_alive.ui.Lyric;

public class stillalive {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("\033[H\033[2J");  
        System.out.flush();     
        ui UI = new ui();
        long endtime = 0;
        for(int page = 0;page<UI.lyricslist.length;page++){
            Thread.sleep(UI.lyricslist[page][0].before-endtime);
            String linestr = "|";
            int linenum = 1;
            printui(UI);
            for(int i = 0;i<UI.background.length-2;i++){
                System.out.print("\033[F\r");
                System.out.print("\033[F\r");
            }
            Lyric[] lyrics = UI.lyricslist[page];
            for(int line = 0;line<lyrics.length;line++){
                Lyric lyric = lyrics[line];
                Thread.sleep(lyric.before-endtime);
                for(int position=0; position<lyric.lyrics.length();position++){
                    linestr+= lyric.lyrics.charAt(position);
                    System.out.print("\r"+UI.background[linenum]+"\r"+linestr);
                    if(lyric.lyrics.charAt(position)=='\n'){
                        System.out.println();
                        linenum++;
                        linestr="|";
                        System.out.print("\r"+UI.background[linenum]+"\r"+linestr);

                    }
                    Thread.sleep(lyric.during/lyric.lyrics.length());
                }
                endtime=lyric.before+ lyric.during;
            }
            for(int i = linenum;i>0;i--){
                System.out.print("\033[F\r");
                System.out.print("\033[F\r");
            }
        }
        printui(UI);
    }
    public static void printui(ui UI){
        for(int i = 0;i<UI.background.length-1;i++){
                System.out.println();
                System.out.println(UI.background[i]);
            }
            
            System.out.println();
            System.out.print(UI.background[UI.background.length-1]);
    }

}
