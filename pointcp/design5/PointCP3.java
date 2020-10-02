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
public class PointCP3 extends PointCP5
{
  //Constructors ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public PointCP3(char type, double xOrRho, double yOrTheta)
  {
    if(type != 'C' && type != 'P')
      throw new IllegalArgumentException();
	if(type == 'C'){
		this.xOrRho = xOrRho;
		this.yOrTheta = yOrTheta;
	} else {
		this.xOrRho = (Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
		this.yOrTheta = (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
	}
  
    typeCoord = 'C'; //since all points here will be Cartesian
  }
	
  
  //Instance methods **************************************************
 
 
  public double getX()
  {
      return xOrRho;
  }
  
  public double getY()
  {
      return yOrTheta;
  }
  
  public double getRho()
  {
      return (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));
  }
  
  public double getTheta()
  {
      return Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
  }
  
	
  /**
   * Converts Cartesian coordinates to Polar coordinates.
   */
  public PointCP2 convertStorageToPolar()
  {

      //Calculate RHO and THETA
      double temp = getRho();
	  double temp2 = getTheta();
	  System.out.println(temp);
	  System.out.println(temp2);
      double yTheta = temp2;
	  
      double xRho = temp;
      
	  char TempType;
      TempType = 'P';  //Change coord type identifier
	  
	  System.out.println(yTheta);
	  
		PointCP2 PointNew = new PointCP2(TempType, xRho, yTheta);

		return PointNew;
	
  }
	
  /**
   * Converts Polar coordinates to Cartesian coordinates.
   */
  public void convertStorageToCartesian() // no need since already cartesian
  {
    if(typeCoord != 'C')
    {
      //Calculate X and Y
      double temp = getX();
      yOrTheta = getY();
      xOrRho = temp;
   
      typeCoord = 'C';	//Change coord type identifier
    }
  }

}
