xjc *.xsd
cd cybox
xjc -b . *
cd ../
cd external
xjc -b . *
cd ../extensions
xjc -b . *