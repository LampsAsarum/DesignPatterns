#pragma once

#include "Strategy.h"

class StrategyMultiply : public Strategy
{
public:
	StrategyMultiply();
	virtual ~StrategyMultiply();

	virtual int ExecuteStrategy(int a, int b);
};

