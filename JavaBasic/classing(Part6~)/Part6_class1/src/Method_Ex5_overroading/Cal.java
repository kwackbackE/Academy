package Method_Ex5_overroading;

public class Cal {
    //정사각형의 넓이
    double areaRectangle(double width){
        return width*width;
    }

    //직사각형의 넓이
    double areaRectangle(double width, double height){
        return width*height;
    }
}