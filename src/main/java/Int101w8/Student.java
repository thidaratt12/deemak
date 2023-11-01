package Int101w8;
public class Student {
        public Student(int id, String firstname, String lastname) {
            if(id < 0 || firstname == null || lastname == null || firstname.isBlank() || lastname.isBlank()) // blank =  "    " : whitespace
                throw new IllegalArgumentException();
            this.id = id;
            this.firstname = firstname;
            this.lastname = lastname;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Student{");
            sb.append("id=").append(id);
            sb.append(", firstname=").append(firstname);
            sb.append(", lastname=").append(lastname);
            sb.append('}');
            return sb.toString();
        }
    }
