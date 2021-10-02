
public class Order_Delievered implements State{
	
	
	
	
	TacoMachine machine;
	
	public Order_Delievered(TacoMachine machine) {
		this.machine = machine;
		
	}
	
	@Override
	public void InsertOrder() {
		
		System.out.println(" Order_Delievered State - Taco machine Deleivered your order");
		
	}

	@Override
	public void Order_Progress() {
	
		System.out.println(" Order_Delievered State - Taco machine is Prepared your order");
		
	}

	@Override
	public void Order_Deleivered() {
		
		System.out.println(" Order_Delievered State - Your Taco order is delivered");
		machine.setState(machine.getOrdere_closed());
	}

}
