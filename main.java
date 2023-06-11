package OOPhw4;

import OOPhw4.controllers.StudentController;
import OOPhw4.controllers.TeacherController;
import OOPhw4.repository.StudentsRepository;
import OOPhw4.repository.TeacherRepository;
import OOPhw4.service.StudentService;
import OOPhw4.service.TeacherServise;
import OOPhw4.view.SortType;
import OOPhw4.view.StudentView;
import OOPhw4.view.TeacherView;

public class main {
    public static void main(String[] args) {

        TeacherView view = getTeacherView();
//----------------------------------------------------------------------

        view.create("Ivan Morozov", 18, "02");
        view.create("Petr Vorobev", 19, "03");
        view.create("Sidor Sidorov", 20, "112");
        view.sendOnConsole(SortType.NONE);
        view.create("Elena Ivanova", 19, "911");
        view.create("Anna Morozova", 17, "01");
        view.sendOnConsole(SortType.NONE);
        view.sendOnConsole(SortType.NAME);
        view.sendOnConsole(SortType.FAMILY);
        view.sendOnConsole(SortType.AGE);
        view.editTeacher(2L);
        view.sendOnConsole(SortType.NONE);
    }

    private static TeacherView getTeacherView() {
        TeacherRepository repository = new TeacherRepository();
        TeacherServise service = new TeacherServise(repository);
        TeacherController controller = new TeacherController(service);
        return new TeacherView(controller);
    }


}

