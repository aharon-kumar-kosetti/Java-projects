#include<stdio.h>
#include <stdlib.h>

struct node
{
	int data;
	struct node *next;
}*head=NULL, *newNode, *lastNode, *temp1, *temp2, *temp3;

void insert_end(int num)
{
	newNode=(struct node*)malloc(sizeof(struct node));
	newNode->data=num;
	newNode->next=NULL;
	if(head==NULL)
	{
		head=newNode;
	}
	else
	{
		lastNode=head;
		while(lastNode->next!=NULL)
			lastNode=lastNode->next;
		lastNode->next=newNode;
	}
}

void display()
{
	struct node *temp=head;
	if(head==NULL)
	{
		printf("List is empty!!\n");
		return;
	}
	printf("The linked list is:\n");
	while(temp!=NULL)
	{
		printf("%d->",temp->data);
		temp=temp->next;
	}
	printf("NULL\n");
}

void remove_duplicates()
{
	if(head==NULL)
	{
		printf("List is empty!!\n");
		return;
	}
	temp1=head;
	while(temp1!=NULL)
	{
		temp2=temp1;
		while(temp2->next!=NULL)
		{
			if(temp2->next->data==temp1->data)
			{
				temp3=temp2->next;
				temp2->next=temp2->next->next;
				free(temp3);
			}
			else
			{
				temp2=temp2->next;
			}
		}
		temp1=temp1->next;
	}
}

int main()
{
	int n, i, num;

	printf("Enter number of elements: ");
	scanf("%d", &n);

	for(i=0;i<n;i++)
	{
		printf("Enter element %d: ", i+1);
		scanf("%d", &num);
		insert_end(num);
	}

	printf("\nBefore removing duplicates:\n");
	display();

	remove_duplicates();

	printf("\nAfter removing duplicates:\n");
	display();

	return 0;
}
