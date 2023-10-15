package CS116_Exam1;

public class StudentIDManager {
    private int[] studentIDs;

    private int numStudents = 0;

    public StudentIDManager(int[] studentIDs) {
        this.studentIDs = new int[100];
    }

    public void addStudentID(int studentID, int index) {
        if (numStudents < studentIDs.length) {
            studentIDs[numStudents] = studentID;
            numStudents++;
        } else {
            System.out.println("Student ID is full");
        }
    }

    public void removeStudentID(int studentID) {
        for (int i = 0; i < numStudents; i++) {
            if (studentIDs[i] == studentID) {
                studentIDs[i] = studentIDs[numStudents - 1];
                numStudents--;
            }
        }
    }

    public void sortStudentID() {
        for (int i = 0; i < studentIDs.length - 1; i++) {
            //start at 0 index and go to last index
            int minIndex = i;
            //set min index to ith element
            for (int j = i + 1; j < studentIDs.length; j++) {
                //i+1 represents the next index next to the minIndex
                if (studentIDs[j] < studentIDs[minIndex]) {
                    //if the next element j is smaller than minIndex, swap them
                    minIndex = j;
                }
            }
            int temp = studentIDs[minIndex];
            studentIDs[minIndex] = studentIDs[i];
            studentIDs[i] = temp;
            //simple swap algorithm
        }
    }

    public int[] getSortedStudentID() {
        //return an array of ints representing the sorted student IDs after sorting. The array should be sorted in acsending order.
        for (int i = 0; i < studentIDs.length - 1; i++) {
            //start at 0 index and go to last index
            int minIndex = i;
            //set min index to ith element
            for (int j = i + 1; j < studentIDs.length; j++) {
                //i+1 represents the next index next to the minIndex
                if (studentIDs[j] < studentIDs[minIndex]) {
                    //if the next element j is smaller than minIndex, swap them
                    minIndex = j;
                }
            }

            int temp = studentIDs[minIndex];
            studentIDs[minIndex] = studentIDs[i];
            studentIDs[i] = temp;

            }
        return studentIDs;
        }
        public int getStudentIDAt(int index) {
            for (index = 0; index < numStudents; index++) {
                if (studentIDs[index] == studentIDs[index]) {
                    return studentIDs[index];
                } else {
                    return -1;
                }
            }
            return index;
        }


        public int getTotalStudents() {
            return numStudents;
        }
    }


