// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

/**
 * This class contains instances of coordinates in either polar or
 * cartesian format.  It also provides the utilities to convert
 * them into the other type. It is not an optimal design, it is used
 * only to illustrate some design issues.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @version July 2000
 */
public class PointCP2 extends PointCP5
{
  //Constructors ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public PointCP2(char type, double xOrRho, double yOrTheta)
  {
	  //System.out.println(yOrTheta);
    if(type != 'C' &&  type != 'P')
      throw new IllegalArgumentException();
    this.xOrRho = xOrRho;
    this.yOrTheta = yOrTheta;
    if(type == 'C'){
      this.xOrRho = (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));
      this.yOrTheta = Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
	  //System.out.println(this.yOrTheta);
	}
    typeCoord = 'P';
  }
	
  
  //Instance methods **************************************************
 
 
  public double getX()
  {
      return (Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
  }
  
  public double getY()
  {
      return (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
  }
  
  public double getRho()
  {
      return xOrRho;
  }
  
  public double getTheta()
  {
      return yOrTheta;
  }
  
	
  /**
   * Converts Cartesian coordinates to Polar coordinates.
   */
  public void convertStorageToPolar()
  {
    if(typeCoord != 'P')
    {
      //Calculate RHO and THETA
      double temp = getRho();
      yOrTheta = getTheta();
      xOrRho = temp;
      
      typeCoord = 'P';  //Change coord type identifier
    }
  }
	
  /**
   * Converts Polar coordinates to Cartesian coordinates.
   */
  public PointCP3 convertStorageToCartesian()
  {
    
      //Calculate X and Y
      
      double aY;
      double anX;
      double temp = getX();
      aY = getY();
      anX = temp;
      
      PointCP3 yoint = new PointCP3('C', anX, aY);
      return yoint;
      //typeCoord = 'C';	//Change coord type identifier
    
  }

}
