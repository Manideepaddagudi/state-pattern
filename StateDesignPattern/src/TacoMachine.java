
public class TacoMachine {
	
	State order_progress;
	State insert_order;
	State ordere_closed;
	
	State state ;
	
	public TacoMachine()
	{
		 order_progress = new Order_Progress(this);
		 insert_order = new InsertOrder(this);
		 ordere_closed = new Order_Delievered(this);
		 state= insert_order;
		 

	}
	
	public void takeorder() {
	
		state.InsertOrder();
	
	}
	public void makeoder() {
		
		
		state.Order_Progress();
	}
	
	public void deliver()
	{
		state.Order_Deleivered();
	}

	public State getOrder_progress() {
		return order_progress;
	}

	public void setOrder_progress(State order_progress) {
		this.order_progress = order_progress;
	}

	public State getInsert_order() {
		return insert_order;
	}

	public void setInsert_order(State insert_order) {
		this.insert_order = insert_order;
	}

	public State getOrdere_closed() {
		return ordere_closed;
	}

	public void setOrdere_closed(State ordere_closed) {
		this.ordere_closed = ordere_closed;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	


public void operate(int item)
{
	if(item==1) {
		takeorder();
		setState(order_progress);
		makeoder();
		deliver();	
		

	}else if(item==2)
	{
		setState(order_progress);
		takeorder();
		makeoder();
		deliver();	
		
		
	}else if(item==3)
	{
		setState(ordere_closed);
		takeorder();
		makeoder();
		deliver();	
		
	}
}
	
	
	

}
