public class AddresArray {
	private Address[] adreslist;
	private int last;


	public AddresArray() {
	this.adreslist = new Address[10];
}
	public void add(Address adres) {
		if (last == this.adreslist.length)
		{
			Address[] tmp = new Address[this.adreslist.length];
			System.arraycopy(adreslist, 0, tmp, 0, last);
			this.adreslist = tmp;
			this.adreslist[last]=adres;
			last++;
		}
	}
	public void del(int pos) {
		this.adreslist[pos]=null;
		for (int i = pos; i<last; i++){
			this.adreslist[i]=this.adreslist[i+1];
		}
		last--;
		
	}
	public void FindBySity(String sity) {
		for (int i = 0; i<adreslist.length; i++)
		{
			if (sity.equals(adreslist[i].getSity()))
			{
				System.out.println(this.adreslist[i].toString());
			}
		}
	}
	public void FindByStreet(String streat) {
		for (int i = 0; i<adreslist.length; i++)
		{
			if (streat.equals(adreslist[i].getSity()))
			{
				System.out.println(this.adreslist[i].toString());
			}
		}
	}	
	public void FindByHouse(String house) {
		for (int i = 0; i<adreslist.length; i++)
		{
			if (house.equals(adreslist[i].getSity()))
			{
				System.out.println(this.adreslist[i].toString());
			}
		}
	}
	public void Print() {
		for(int i = 0; i<adreslist.length;i++)
		{
			System.out.println('#'+i+' '+ adreslist[i].toString());
		}
	}
}