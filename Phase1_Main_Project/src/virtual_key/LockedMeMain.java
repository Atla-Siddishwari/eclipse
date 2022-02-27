package virtual_key;
import com.virtual_key.menuOptions;
public class LockedMeMain {
public static void main(String[] args) {
// Create "main" folder if not present in current folder structure
File_Operation.createMainFolderIfNotPresent("main");
menuOptions.printWelcomeScreen("Locker", "Bhavya");
HandleOption.handleWelcomeScreenInput();
}
}
