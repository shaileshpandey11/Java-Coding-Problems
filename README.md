# Java-Coding-Problems
It includes all java coding problems which is used to refresh your basic concepts of Java

# Problem
A data center may contain hundreds and thousands of servers, distributed across different racks. There are agents (one per rack) each monitoring the servers placed on the rack and collect the following data from each server periodically (say every minute).
date_time, server_id, cpu_usage, total_disk_space, used_disk_space, total_memory, used_memory, temperature
NOTE: Each agent collects data for multiple servers and there are multiple such agents.
All the agents periodically upload the collected data (as a file) to a single FTP directory. The directory (common for all the agents) will thus contain multiple files uploaded by multiple agents periodically (each file would contain 0 or more records for different servers).
Your library should continuously monitor the directory (assume the directly is mounted on the machine on which your library is placed i.e. the library can access it has local directory) and process the files which are uploaded to the directory by the agents.
- The library should be able to process multiple files concurrently, with a provision put a max limit on how many files will be processed concurrently.
- Different files could contain data in different format e.g. some files could contain data in CSV (comma separated values), some could contain data in XML format, some could contain in JSON format etc. The file extension will indicate the data format used in the file (e.g. .csv --> comma separate list, .json --> json formatted data, .xml --> xml formatted data).
- As part of this assignment implement support for CSV data format only but design the library in such a way that new data formats can be supported easily in the future.
The library should generate alert when record matching certain criteria is encountered.
e.g.
- Generate alert when disk usage is > 70%
- Generate alert when memory usage is > 80%
- As part of this assignment implement support alerts based on percentage disk and memory utilization but design the library in such a way the system can easily support different and complex criteria for alerts in the future. e.g. generate alert when temperature > 40 and cpu_usage < 10% or memory usage increased by more than 20% in two subsequent records for the same server.
- As part of this assignment provide alert implantation which logs the alter to a file but design in such a way that alerts could be generated in different forms like email, SMS, HTTP request etc. in future.
