package cleancode;
public class Construction_cost {
	
	public static double calculate_cost(String material_standard,double area_of_house,boolean is_automated)
	{
		
		switch(material_standard)
		{
			case "use_standard": return area_of_house*1200;
			
			case "above_standard": return area_of_house*1500;
			
			case "high_standard": if(is_automated)
					{
						return area_of_house*2500;
					}
					return area_of_house*1800;
			default:return -1;
		}
	}

}
