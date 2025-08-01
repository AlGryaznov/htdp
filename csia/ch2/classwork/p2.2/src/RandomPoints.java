import edu.princeton.cs.algs4.StdDraw;

public class RandomPoints {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        StdDraw.enableDoubleBuffering();

        final double scale = 5;


        StdDraw.setXscale(-scale, scale);
        StdDraw.setYscale(-scale, scale);
 /*
        for (int i = 0; i < n; i++)
        {


            double x = StdRandom.gaussian(.5, .2);
            double y = StdRandom.gaussian(.5, .2);


            double x = StdRandom.exponential(100);
            double y = StdRandom.exponential(100);


            double x = StdRandom.pareto(100);
            double y = StdRandom.pareto(100);

            double x = StdRandom.cauchy();
            double y = StdRandom.cauchy();


            double x = StdRandom.geometric(0.5);
            double y = StdRandom.geometric(0.5);

            StdDraw.point(x, y);
        }*/


        //StdDraw.setXscale(0, 1);
        //StdDraw.setYscale(0, 1);

        for (int i = 0; i < n; i++)
        {

            double x = StdRandom.gaussian(0, .6);
            double y = StdRandom.gaussian(0, .6);
            /*
            double x = Math.random();
            double y = Math.random();*/
            StdDraw.point(x, y);
        }

        StdDraw.show();
    }
}

