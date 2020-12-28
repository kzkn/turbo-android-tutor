Rails.application.routes.draw do
  root to: 'app#home'
  get '/home', to: 'app#home'
  get '/messages', to: 'app#messages'
  get '/topics/:id', to: 'app#topic'
  get '/settings', to: 'app#settings'
end
