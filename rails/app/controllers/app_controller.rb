class AppController < ApplicationController
  def home
  end

  def messages
  end

  def topic
    @id = params[:id]
  end

  def settings
  end
end
