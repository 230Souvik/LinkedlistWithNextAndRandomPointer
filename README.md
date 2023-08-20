An example of linked list with a random pointerGiven a linked list of size N where each node has two links: one pointer points to the next node and the second pointer points to any node in the list. The task is to create a clone of this linked list in O(N) time. 

Note: The pointer pointing to the next node is ‘next‘ pointer and the one pointing to an arbitrary node is called ‘arbit’ pointer as it can point to any arbitrary node in the linked list. 

An example of the linked list is shown in the below image:

An example of linked list with a random pointerAn example of linked list with a random pointer
An example of linked list with a random pointerAn example of linked list with a random pointer

Approach 1 (Using Extra Space): The idea to solve this problem is: 


First create a single linked list with only the ‘next’ pointer and use a mapping to map the new nodes to their corresponding nodes in the given linked list. Now use this mapping to point the arbitrary node from any node in the newly created list. 

Follow the steps mentioned beloved to implement the above idea:

Create a duplicate (say Y) for each node (say X) and map them with corresponding old nodes (say mp, So mp[X] = Y).
Create the single linked list of the duplicate nodes where each node only has the ‘next’ pointer.
Now iterate over the old linked list and do the following:
Find the duplicate node mapped with the current one. (i.e., if the current node is X then duplicate is mp[x])
Make the arbit pointer of the duplicate node pointing to the duplicate of the current->arbit node (i.e., mp[x]->arbit will point to mp[X->arbit]).
The linked list created in this way is the required linked list. 
Follow the illustration below for a better understanding:

Illustration:

Consider the linked list shown below:

Original linked list 
Original linked list 

The green links are the arbit pointers

Creating copy of Nodes and next pointer:

Initially create single linked list of duplicate nodes with only the next pointers and map them with the old ones. 
Here the blue coloured links are used to show the mapping.


New linked list mapped with old nodes

Linking the arbit pointers:

Now iterating the old array and update the arbit pointers as mentioned in the approach. The green coloured links are the arbit pointers.

At first node:

Linking arbit pointer of duplicate of 1st node
Linking arbit pointer of duplicate of 1st node

At second node:

Linking arbit pointer of duplicate of 2nd node
Linking arbit pointer of duplicate of 2nd node

At third node:

Linking arbit pointer of duplicate of 3rd node
Linking arbit pointer of duplicate of 3rd node

At fourth node:

Linking arbit pointer of duplicate of 4th node
Linking arbit pointer of duplicate of 4th node

At fifth node:

Linking arbit pointer of duplicate of 5th node
Linking arbit pointer of duplicate of 5th node

The final linked list is as shown below:

The original and the clone
The original and the clone
