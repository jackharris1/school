/** Author: Jack Harris
 *  ClassID: 362
 *  Class content: This class contains a basic constructor SimpleList
 *  that sets count to 0 and creates a 10 integer array.
 *  add() adds an item to the list.
 *  remove() removes an item from the list.
 *  count() returns the number of items in the list.
 *  toString() returns the list as a String.
 *  search() finds the index of a given parameter in the list.
*/

package cse360assign2;

public class SimpleList {
	
	private int[] list;
	private int count;
	
	/** Creates an array to hold 10 integers and set count to 0.
	 */
	
	public SimpleList () {
		this.list = new int[10];
		this.count = 0;
	}
	
	/** @param - the index of the item to be returned from the list.
	 *  @return - returns the list item at the specified index.
	 *  Getter method for list. Return the list item at specified index.
	 */
	
	public int getListItem(int itemIndex) {
		return this.list[itemIndex];
	}
	
	/** @return - returns the count of items in the list
	 *  Getter method for count. Returns count value.
	 */
	
	public int getCount() {
		return this.count;
	}
	
	/** @param addThis - the element to be added
	 *  Add the parameter to the list at the beginning (index = 0).
	 *  Move all the other integers in the list over so there is room.  If the list was full,
	 *  then the last element �falls off� the list.  Increment the count as needed. 
	 */
	
	public void add (int addThis) {
		System.arraycopy(this.list, 0, this.list, 1, this.list.length-1);
		this.list[0] = addThis;
		if (count != 10) {
			this.count++;
		}
	}
	
	/** @param removeThis - the element to be removed
	 *  If the parameter is in the list, then remove it.  
	 *  The other values in the list may need to be moved down.
	 *  Adjust the count as needed. 
	 */
	
	public void remove (int removeThis) {
		if (this.count == 0) {
			return;
		}
		for (int removeCheck= 0; removeCheck < count; removeCheck++) {
			if (this.list[removeCheck] == removeThis) {
				System.arraycopy(this.list, removeCheck+1, this.list, removeCheck, this.list.length - 1 - removeCheck);
			}
		}
		this.count--;
	}
	
	/** @return - the number of elements stores in the list
	 * Return the number of elements stored in the list.
	 */
	
	public int count() {
		return count;
	}
	
	/** Return the list as a String.  The elements must be separated by a space.  
	 *  This means there is not space after the last integer.
	 */
	
	public String toString() {
		String returnThis = "";
		for (int index = 0; index < count; index++) {
			returnThis += Integer.toString(this.list[index]);
			if (index != count-1) {
				returnThis += " ";
			}
		}
		return returnThis;
	}
	
	/** @param searchThis - the item to be searched for
	 *  @return the index of the found element, or -1 if not found
	 *  Return the location of the parameter in the list.
	 *  If the parameter is not in the list, then return -1.
	 */
	
	public int search(int searchThis) {
		for (int searchIndex = 0; searchIndex <= count; searchIndex++) {
			if (this.list[searchIndex] == searchThis) {
				return searchIndex;
			}
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}