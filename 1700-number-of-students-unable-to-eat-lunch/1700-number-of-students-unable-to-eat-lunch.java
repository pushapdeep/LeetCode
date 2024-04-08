class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> student=new ArrayDeque<>();
        Stack<Integer> sandwich=new Stack<>();
        int onesstudent=0,onessandwich=0;
        for(int i=0;i<students.length;i++)
        {
            student.add(i);
            sandwich.add(sandwiches[students.length-i-1]);
            onesstudent+=students[i];
            onessandwich+=sandwiches[i];
        }
        if(onesstudent==onessandwich)
        {
            return 0;
        }
        int c=student.size();
        int i=0;
        int frontindex=-1;
        while(student.size()>0)
        {
            if(students[student.peek()]==sandwich.peek())
            {
                student.remove();
                sandwich.pop();
                frontindex=0;
            }
            else
            {
                frontindex++;
                student.add(student.remove());
            }
            i++;
            if(student.size()>0 && frontindex==student.size())
            {
                break;
            }
            
        }
        return student.size();
    }
}