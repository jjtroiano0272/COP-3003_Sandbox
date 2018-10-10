package sample;

public class Cuboid<E extends Number>{
	/*
	We want to store length breadth height
	Normally we'd have to write multiple different classes to work with multiple data types.
	Instead we used generics here to work with multiple data types.
	*/
	
	private E length;
	private E breadth;
	private E height;
	
	/*
	generated using alt insert
	Type of dimensions is determined at creating of instance.
	Reference available in JP2_3 PDF
	*/
	@Override
	public String toString() {
		return "Cuboid{" +
				"length=" + length +
				", breadth=" + breadth +
				", height=" + height +
				'}';
	}
	
	/*
	 * Something something use a fucking ENUM.
	 * */
	
	/*
	 * And again with a MAP
	 * */
/*
Modify your generic so it only accepts numbers
using wildcards...ref on course site.
*/
}
