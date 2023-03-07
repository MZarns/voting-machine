import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
 
# Dataset
df = pd.read_csv("graphFiles/ballotFile3.csv")
 
# plot
df.plot.area(title = "ballotFile3", xlabel = "Round of Algorithm", ylabel = "Current Vote Count",yticks = np.arange(0,22,1), xticks = np.arange(0,5,1))

# show the graph
plt.show()