import static java.lang.Math.pow;

public class Planet {
	
	double xxPos;
	double yyPos;
	double xxVel;
	double yyVel;
	double mass;
	String imgFileName;
	
	double gravity = 6.67 * pow(10, -11)//G (6.67 * 10-11 N-m2 / kg2).
	
	public Planet(double xP, double yP, double xV, double yV, double m, String img) {
		this.xxPos = xP;
		this.yyPos = yP;
		this.xxVel = xV;
		this.yyVel = yV;
		this.mass = m;
		this.imgFileName = img;
	}

	public Planet(Planet p) {
		this.xxPos = p.xxPos;
		this.yyPos = p.yyPos;
		this.xxVel = p.xxVel;
		this.yyVel = p.yyVel;
		this.mass = p.mass;
		this.imgFileName = p.imgFileName;
	}
	
	public double calcDistance(Planet p) {
		return (this.xxPos + p.xxPos) + (this.yyPos + p.yyPos);
	}
	
	public double calcForceExertedBy(Planet p) {
		return 
	}
}
