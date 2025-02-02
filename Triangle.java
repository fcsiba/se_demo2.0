/*  BILAL AHMED
    ERP: 23070
 */
public class Triangle {
    private Point vertexA;
    private Point vertexB;
    private Point vertexC;
    private Line medianA;
    private Line medianB;
    private Line medianC;


    public Triangle(Point a, Point b, Point c){
    vertexA = a;
    vertexB = b;
    vertexC = c;
    Point temp1 = new Point((vertexB.getX()+vertexC.getX())/2,(vertexB.getY()+vertexC.getY())/2);
    medianA = new Line(vertexA,temp1);
    Point temp2 = new Point((vertexC.getX()+vertexA.getX())/2,(vertexC.getY()+vertexA.getY())/2);
    medianB = new Line(vertexB,temp2);
    Point temp3 = new Point((vertexA.getX()+vertexB.getX())/2,(vertexA.getY()+vertexB.getY())/2);
    medianC = new Line(vertexC,temp3);
    }

    public String toString(){
        return "VertexA:("+vertexA.getX()+","+vertexA.getY()+") VertexB:("+vertexB.getX()+","+vertexB.getY()+") VertexC:("+vertexC.getX()+","+vertexC.getY()+")";
    }

    public double getPerimeter(){
        double dist1 = Math.sqrt(((vertexB.getX()- vertexA.getX())*(vertexB.getX()- vertexA.getX()))+((vertexB.getY()- vertexA.getY())*(vertexB.getY()- vertexA.getY())));
        double dist2 = Math.sqrt(((vertexC.getX()- vertexB.getX())*(vertexC.getX()- vertexB.getX()))+((vertexC.getY()- vertexB.getY())*(vertexC.getY()- vertexB.getY())));
        double dist3 = Math.sqrt(((vertexA.getX()- vertexC.getX())*(vertexA.getX()- vertexC.getX()))+((vertexA.getY()- vertexC.getY())*(vertexA.getY()- vertexC.getY())));
        return dist1+dist2+dist3;

    }

    public String getType(){
        double dist1 = vertex1.distance(vertex2);
        double dist2 = vertex2.distance(vertex3);
        double dist3 = vertex3.distance(vertex1);

        if(dist1 == dist2 && dist2 == dist3 && dist3==dist1){
            return "This Triangle is Equilateral";
        }

        else if(dist1 != dist2 && dist2 != dist3 && dist3!=dist1){
            return "This Triangle is Scalene";
        }

        else{
            return "This Triangle is Isosceles";
        }
    }

    public String getMedianA(){
        return "The coordinates of MedianA are "+this.medianA.toString()+" And the length is "+ this.medianA.getLength();
    }

    public String getMedianB(){
        return "The coordinates of MedianB are "+this.medianB.toString()+" And the length is "+ this.medianB.getLength();
    }

    public String getMedianC(){
        return "The coordinates of MedianC are "+this.medianC.toString()+" And the length is "+ this.medianC.getLength();
    }


}
