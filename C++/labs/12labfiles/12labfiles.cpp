/*
 This programm deleting all scripts from all .html files in directory
*/
#include <iostream>
#include <sys/types.h>
#include <dirent.h>
#include <sys/stat.h>
#include <unistd.h>
#include <fstream>
#include <vector>

using namespace std;

struct dirent *readdir (DIR * dirp);
int lstat ( const char *path, struct stat *buf);
int closedir (DIR *dirp);

int main(int argc, char *argv[]) {
    const char *path = argv[1];
    DIR *d = opendir(path);
    auto current = readdir(d);
    while(current != NULL){
        //cout << current->d_name << endl;
        string file = current->d_name;
        string extention;
        for (int i = file.size()-1; file[i] != '.'; i--){
            extention += file[i];
        }
        if (extention == "lmth"){
            ifstream fRead(string(path) + "/" + string(file));
            string line;
            vector<string> fileText;
            while(getline(fRead,line)){
                fileText.push_back(line);
            }
            fRead.close();
            ofstream fWrite(string(path) + "/" + string(file));
            for (int i = 0; i < int(fileText.size()); i++){
                if (fileText[i].find("<script>") != string::npos){
                    while (fileText[i].find("</script>") == string::npos) i++;
                    i++;
                }
                fWrite << fileText[i] << endl;
            }
            fWrite.close();
        }
        current = readdir(d);
    }
    return 0;
}
