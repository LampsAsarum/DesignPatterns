#pragma once

class Strategy
{
public:
	Strategy();
	virtual ~Strategy();

	virtual int ExecuteStrategy(int a, int b) = 0;
};



