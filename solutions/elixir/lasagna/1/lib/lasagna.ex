defmodule Lasagna do
  @moduledoc """
  lasagna challenge
  """
  @expected_minutes_in_oven 40
  @layer 2
  @alarm "Ding!"
  def expected_minutes_in_oven() do
    @expected_minutes_in_oven
  end
  def remaining_minutes_in_oven(minutes) do
    @expected_minutes_in_oven - minutes
  end
  def preparation_time_in_minutes(number_of_layers) do
    @layer * number_of_layers
  end
  def total_time_in_minutes(number_of_layers, minutes) do
    preparation_time_in_minutes(number_of_layers) + minutes
  end
  def alarm() do
    @alarm
  end
end
