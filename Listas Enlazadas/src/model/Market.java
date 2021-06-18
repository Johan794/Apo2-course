package model;

public class Market {
	private Product first;
	private int size;
	
	public Market() {
		size =0;
	}
	//agregar al final
	public void addProduct(String name , double price , long id) {
		Product p = new Product(name, price,id);
		if(first==(null)) {
			first = p;
		}else{
			Product last = first;
			while(last.getNext()!=null) {
				last = last.getNext();
			}
			last.setNext(p);
			
			
		}
		
		size++;
		
	}
	//agregar al principio
	public void addProductHead(String name , double price , long id) {
		Product p = new Product(name, price,id);
		p.setNext(first);
		first = p;
		size++;
	}
	
	public boolean addProduct(int index,String name , double price , long id) {
		boolean added = false;
			if(index <size) {
				Product p = new Product(name, price,id);
				int i =1;
				Product current = first; 
				while(i<index) {
					i++;
					current = current.getNext();
				}
				p.setNext(current.getNext());
				current.setNext(p);
				size++;
				added = true;
				
			}
		return added;
		
	}
	
	public Product search(Long id) {
		Product founded=null;
		boolean out = false;
		if(size!=0) {
			if(first.getId()== id) {
				founded = first;
			}else {
				if(first.getNext()!=null) {
					Product toCompare = first.getNext();
					int i=1;
					while(i<size && !out) {
						if(toCompare.getId() == id) {
							founded = toCompare;
							out = true;
						}else if(toCompare.getNext()!=null){
							toCompare = toCompare.getNext();
						}else {
							out= true;
						}
						i++;
					}
				}
				
			}
		}
		return founded;
	}
	
	public Product remove(long id) {
		Product deleted = null;
		boolean out = false;
		if(size!=0) {
			if(first.getId()== id) {
				deleted = first;
				if(first.getNext()!=null) {
					first = first.getNext();	
				}else {
					first = null;
					size =0;
				}
				
			}else {
				if(first.getNext()!=null) {
					Product aft = first;
					Product toCompare = first.getNext();
					int i=1;
					while(i<size && !out) {
						if(toCompare.getId() == id) {
							deleted = toCompare;
							if(deleted.getNext()!=null) {
								aft.setNext(deleted.getNext());
								out = true;
								size--;
							}else {
								aft.setNext(null);
								out=true;
								size--;
							}
							
						}else if(toCompare.getNext()!=null){
							aft = toCompare;
							toCompare = toCompare.getNext();
						}else {
							out= true;
						}
						i++;
					}
				}
				
			}

		}
				
		
		return deleted;
	}
	
	public String showList() {
		String list ="Elementos de la lista: ";
		if(first!=null) {
			if(first.getNext()!=null) {
				list+= first.toString()+",";
				Product next = first.getNext();
				while(next.hasNext()) {
					next = next.getNext(); 
					list+= next.toString()+",";
				}		
			}else {
				list+= first.toString();
			}
			
		}else {
			list+="Lista vacia";
		}
		
		return list;
	}
	

}
