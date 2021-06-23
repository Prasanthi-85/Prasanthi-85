Set projectLocation=C:\Users\VISHNU SUMANTH\eclipse-workspace\Frm_batch7
cd %projectLocation%
Set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml