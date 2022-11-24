package InheritencePack;

public class inheritenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoxWeight bw1 = new BoxWeight(10, 20, 15, 35.33);
		double vol;
		vol = bw1.volume();
		System.out.println("Vol of bw - "+vol);
		System.out.println("Weight of bw - "+bw1.weight);
		
//		BoxWeight bw2 = (BoxWeight) new Box(bw1);
		
		Box plainBox = new Box();
		plainBox = bw1;
		vol = plainBox.volume();
		System.out.println("Vol of plainBox - "+vol);
//		System.out.println("Weight of plainBox - "+plainBox.weight);  // Not allowed, because weight is not defined in Box class
		
	}

}

class Box{
	private double hieght, width, depth;
	
	Box(Box boxObj){
		hieght = boxObj.hieght;  //Equevallent to this.hieght = hieght;
		width = boxObj.width;
		depth = boxObj.depth;
		
		System.out.println("H - "+hieght+" | W - "+width+" | D - "+depth);
	}
	
	Box(double w, double h, double d){
		width = w;
		hieght = h;
		depth = d;
	}
	
	Box(){
		width = hieght = depth = -1;
		
	}
	
	Box(double length){
		width = hieght = depth = length;
	}
	
	double volume(){
		return width*hieght*depth;
	}
}

class BoxWeight extends Box{
	double weight;
	
	public BoxWeight(double w, double h, double d, double m) {
		// TODO Auto-generated constructor stub
		/*width = w;
		hieght = h;
		depth = d;*/
		super(w, h, d);
		weight = m;
	}
}
