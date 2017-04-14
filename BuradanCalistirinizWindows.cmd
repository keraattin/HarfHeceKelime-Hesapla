@echo off

:: Colorset changing 0=Black Background , d=Purple Text color
color 0d

:: Developer define section
call:dev_define

:: Execution section
java -jar executableJava.jar

echo.

:: Would you keep executing section 
set /p var= tekrar calistirmak icin Y bitirmek icin N ye basiniz :
if %var% EQU Y cls && BuradanCalistirinizWindows.cmd
if %var% NEQ Y call :exit_n

pause
EXIT /b 0

:exit_n
echo.
echo ****************************************
echo *                                      *
echo * Thank you for executing @keraattin   *
echo * see you...                           *
echo *                                      *
echo ****************************************
echo.
Exit /b 0

:dev_define
echo.
echo ****************************************
echo *                                      *
echo * This script written by @keraattin    *
echo *                   powered by Java    *
echo *                                      *
echo ****************************************
echo.
