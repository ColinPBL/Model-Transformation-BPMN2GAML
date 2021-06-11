# This script is provided as is
#
#
#

import pandas as pa

# First, we load the log file into a panda dataframe (path should be modified accordingly)
event_log = pa.read_csv("./event_log.csv")

# We create a dictionary to get each activity sequence for each case
dict_from_csv = dict({case_id:[] for case_id in event_log.case_id})

# This loop goes through the file and assigns each activity to the relevant case_id
for case_id in event_log.case_id:
    for activity in event_log.query(f"case_id == {case_id}").activity:
        if activity not in dict_from_csv[case_id]:
            dict_from_csv[case_id].append(activity)

# We now want a summary of which execution cases have been identified in the logs
# so we create a list and add every unique trace
unique_traces = []
for value in dict_from_csv:
    if dict_from_csv[value] not in unique_traces:
        unique_traces.append(dict_from_csv[value])
    
print("\nThese are the unique traces identified from the generated log file:\n")
for trace in unique_traces:
    print("--------------------------------")
    for activity in trace:
        print(activity)