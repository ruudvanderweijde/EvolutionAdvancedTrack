---M3 diff tool---

--Functionality:
- Compare different versions of an M3, and gather information about changes
- Compare results of the previous functionality

--Comparing different versions of M3:
To analyse two or more version transitions, import the Core.rsc file. You can change the list
of "projects" and use the run(subdirectory) function, specifying the subfolder of "M3" where these projects can be found. 
Projects is a misnomer as it looks up binary M3 files. This should be fixed in a next version.

For the Android M3 sources (for which this tool was initially created) you can also use the shorthand runSRC, runJAR and runDOC
functions for which you can optionally specify a whiteList pattern. Any class/method/file that does not match this pattern will be excluded
from analysis. These functions take a range of API levels as arguments, which will be sought using the appropriate CSV files. In these files
you can specify where to find the M3 models of each version. Comparing too many API levels at once can trigger OutOfMemoryExceptions.

In the Utils module you can find functions to create M3s and write them to binary files.

When the analysis finishes, the results of the Version Transition analysis will be written to cache files.

--Comparing results of the Version Transition analysis
When the Version Transition analysis finishes, it writes its results to cache files. These cache files are the input
of the comparison tool found in TransitionDifferencesUtil. All this does is show the differences between the two VersionTransitions
to make the comparison easier. It excludes "unchanged" methods (for fields and classes this isn't recorded atm). The
compareVersionTransitions function takes as input a list relation with strings on both sides. These are the names of the cache files.