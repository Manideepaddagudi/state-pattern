
public class Order_Progress  implements State{
	
	TacoMachine machine;
	
	public Order_Progress(TacoMachine machine) {
		this.machine = machine;
		
	}


	@Override
	public void InsertOrder() {
		
		System.out.println(" Order_Progress State - Taco is in progress cannot order");
		
	}

	@Override
	public void Order_Progress() {
		System.out.println(" Order_Progress State - Your Taco order is prepared");
		machine.setState(machine.getOrder_progress());
	}

	@Override
	public void Order_Deleivered() {
		
		System.out.println(" Order_Progress State - Your Pizza preparing it will be delivered");
		
	}

}