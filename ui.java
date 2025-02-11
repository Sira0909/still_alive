package still_alive;


public class ui {
    //beats before lyrics, beats lyrics take, lyrics:
    public class Lyric{
        int before;
        int during;
        String lyrics;
        int endsit = 0;
        public Lyric(int before, int during, String lyrics){
            this.before = before;
            this.during = during;
            this.lyrics = lyrics;
        }
        public Lyric(int endsit){
            this.endsit=1;
        }
    };
    String firstline = "-------------------------------------------------------- -------------------------------------------------------- ";
    String regularline="|                                                      ||                                                        |";
    String endcredits ="|                                                      ||--------------------------------------------------------|";
    String lyriclines ="|                                                      |                                                          ";
    String endlyrics = "--------------------------------------------------------                                                          ";
    String[] background = {
        firstline,
        regularline,
        regularline,
        regularline,
        regularline,
        regularline,
        regularline,
        regularline,
        regularline,
        regularline,
        regularline,
        regularline,
        regularline,
        endcredits,
        lyriclines,
        lyriclines,
        lyriclines,
        lyriclines,
        lyriclines,
        lyriclines,
        lyriclines,
        lyriclines,
        lyriclines,
        lyriclines,
        lyriclines,
        lyriclines,
        lyriclines,
        lyriclines,
        endlyrics
    };
    Lyric[] lyrics = {
            new Lyric(0,5000,"Forms FORM-29827281\nTest Assessment Report\n\n\n"),
            new Lyric(8000,1500,"This was a triumph.\n"),
            new Lyric(12000,2000,"I'm making a note here:\n"),
            new Lyric(14000, 1500,"HUGE SUCCESS.\n"),
            new Lyric(17000,2500,"It's hard to overstate\n"),
            new Lyric(19500,2500,"my satisfaction.\n"),
            new Lyric(24000,2000,"Aperture Science\n"),
            new Lyric(28000,1900,"We do what we must\n"),
            new Lyric(29900,1100,"because we can.\n"),
            new Lyric(33000,3000,"For the good of all of us.\n"),
            new Lyric(36500,2000,"Except the ones who are dead.\n"),
            new Lyric(38500,2400,"\nBut there's no sense crying\n"),
            new Lyric(40900,1300,"over every mistake.\n"),
            new Lyric(42500,2000,"You just keep on trying\n"),
            new Lyric(44500,1500,"till you run out of cake.\n"),
            new Lyric(46500,2500,"And the Science gets done.\n"),
            new Lyric(49000,1500,"And you make a neat gun.\n"),
            new Lyric(50500,1500,"For the people who are\n"),
            new Lyric(52000,1000,"still alive.\n")
            // new Lyric(1)
    };
    Lyric[][] lyricslist ={
        {
            new Lyric(0,5000,"Forms FORM-29827281\nTest Assessment Report\n\n\n"),
            new Lyric(8000,1500,"This was a triumph.\n"),
            new Lyric(12000,2000,"I'm making a note here:\n"),
            new Lyric(14000, 1500,"HUGE SUCCESS.\n"),
            new Lyric(17000,2500,"It's hard to overstate\n"),
            new Lyric(19500,2500,"my satisfaction.\n"),
            new Lyric(24000,2000,"Aperture Science\n"),
            new Lyric(28000,1900,"We do what we must\n"),
            new Lyric(29900,1100,"because we can.\n"),
            new Lyric(33000,3000,"For the good of all of us.\n"),
            new Lyric(36500,2000,"Except the ones who are dead.\n"),
            new Lyric(38500,2400,"\nBut there's no sense crying\n"),
            new Lyric(40900,1300,"over every mistake.\n"),
            new Lyric(42500,2000,"You just keep on trying\n"),
            new Lyric(44500,1500,"till you run out of cake.\n"),
            new Lyric(46500,2500,"And the Science gets done.\n"),
            new Lyric(49000,1500,"And you make a neat gun.\n"),
            new Lyric(50500,1500,"For the people who are\n"),
            new Lyric(52000,1000,"still alive.\n")
        },
        {
            new Lyric(55000,500,"FORMS Form-55551-6:\n"),
            new Lyric(55500,1500,"Personal File Addendum\n\n"),
            new Lyric(57000,2500,"Dear <<Subject Name Here>>,\n\n"),
            new Lyric(60000,1800,"I'm not even angry.\n"),
            new Lyric(64000,3000,"I'm being so sincere right now. \n"),
            new Lyric(69000,2000,"Even though you"),
            new Lyric(71000,1000," broke my heart.\n"),
            new Lyric(72000,2000,"and killed me.\n"),
            new Lyric(76000,1000,"And tore me into pieces.\n"),
            new Lyric(80000,2000,"And threw every piece into"),
            new Lyric(82000,2000," a fire.\n"),
            new Lyric(85000,3000,"As they burned it hurt because\n"),
            new Lyric(88000,2000,"I was so happy for you!\n"),
            new Lyric(90100,2600,"Now these points of data\n"),
            new Lyric(92700,1800,"make a beautiful line.\n"),
            new Lyric(94500,2000,"And we're out of beta.\n"),
            new Lyric(96500,1700,"We're releasing on time.\n"),
            new Lyric(98200,2300,"So I'm GLaD. I got burned.\n"),
            new Lyric(100500,2200,"Think of all the things we learned\n"),
            new Lyric(102700,1300,"for the people who are\n"),
            new Lyric(104000,2000,"still alive.\n")
        }
    };
}
